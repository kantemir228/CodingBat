package Array;

public class makeMiddle {
    public static void main(String[] args) {


    }public int[] makeMiddle(int[] nums) {
        int arr[]=new int[2];
        if(nums.length==2){
            return nums;
        }
        arr[0]=nums[nums.length/2-1];
        arr[1]=nums[nums.length/2];

        return arr;
    }


}
