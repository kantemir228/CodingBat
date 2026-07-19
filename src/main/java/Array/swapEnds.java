package Array;

public class swapEnds {
    public static void main(String[] args) {

    }public int[] swapEnds(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            arr[i]+=nums[i];
        }
        arr[0]=nums[nums.length-1];

        arr[nums.length-1]=nums[0];
        return arr;
    }

}
