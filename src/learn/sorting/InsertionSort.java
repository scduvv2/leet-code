package learn.sorting;

public class InsertionSort {
    
    public static void main(String[] args) {
        int[] nums = {1,3,4,6,7,2,9,1,0,1};
        PrintArray.print(nums);
        sort(nums);
        System.out.println("\n");
        PrintArray.print(nums);
    }

    private  static void sort(int[] nums) {

        for(int i=1;i<nums.length;i++){
            int key=nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
            
        }
    }

}
