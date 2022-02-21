package learn.sorting;

public class SelectionSort {

    public static void main(String[] args){
        int[] nums = {1,3,4,6,7,2,9,1,0,1};
        System.out.print(nums);
        int currentPosition=0;
        while(currentPosition<nums.length){
            int currentminimum=nums[currentPosition];
            for(int i=currentPosition;i<nums.length;i++){
                if(nums[currentminimum]>nums[i]){
                    currentminimum=i;
                }
            }
            int val = nums[currentPosition];
            if(val>nums[currentminimum]){
                nums[currentPosition]= nums[currentminimum];
                nums[currentminimum]=val;
            }
            currentPosition++;
        }
        System.out.print(nums);
    }
}
