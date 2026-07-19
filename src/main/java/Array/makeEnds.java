package Array;

public class makeEnds {
    public static void main(String[] args) {

    }public int[] makeEnds(int[] nums) {
        int arr[]=new int[2];
        int sr=0;
        int sr1=0;

        sr=nums[0];


        sr1=nums[nums.length-1];

        arr[0]=sr;
        arr[1]=sr1;
        return arr;
    }

}
