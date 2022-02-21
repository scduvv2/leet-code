package learn.sorting;

public class BubbleSort  {

    
    public static void main(String[] args){
        int[] nums = {1,3,4,6,7,2,9,1,0,1};
        PrintArray.print(nums);
        boolean isSorted=false;
        while(!isSorted){
            isSorted=true;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    int val = nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=val;
                    isSorted=false;
                }
            }
        }
        System.out.println("\n");
        PrintArray.print(nums);
    }
    
}
