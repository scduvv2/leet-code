import java.util.Map;
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.myAtoi("42"));
    }

    public int myAtoi(String s) {

        Map<Character, Integer> numSet = new HashMap<>();

        numSet.put('0', 0);
        numSet.put('1', 1);
        numSet.put('2', 2);
        numSet.put('3', 3);
        numSet.put('4', 4);
        numSet.put('5', 5);
        numSet.put('6', 6);
        numSet.put('7', 7);
        numSet.put('8', 8);
        numSet.put('9', 9);

        String sign = "positive";
        int number = 0;
        s = s.trim();
        int startIndex = 0;
        int placeValue = 0;
        if (s.charAt(0) == '-') {
            sign = "negative";
            startIndex = 1;
        } else if (s.charAt(0) == '+') {
            startIndex = 1;
        }
        for (int j = startIndex; j < s.length(); j++) {

            if (!Character.isDigit(s.charAt(j))) {
                break;
            }

            int val = numSet.get(s.charAt(j));
            number = number * 10 ^ placeValue;
            if (j != startIndex) {
                number = number + val * 10 ^ placeValue - 1;
            }
            placeValue++;

        }
        return number;

    }
}