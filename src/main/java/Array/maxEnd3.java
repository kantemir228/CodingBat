package Array;

public class maxEnd3 {
    public static void main(String[] args) {

    }public int[] maxEnd3(int[] nums) {
        int [] arr=new int[3];
        if(nums[0]>=nums[nums.length-1]){
            arr[0]=nums[0];
            arr[1]=nums[0];
            arr[2]=nums[0];
        }else if(nums[0]<nums[nums.length-1]){
            arr[0]=nums[nums.length-1];
            arr[1]=nums[nums.length-1];
            arr[2]=nums[nums.length-1];
        }
        return arr;
    }
}
