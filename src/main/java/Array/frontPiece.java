package Array;

public class frontPiece {
    public static void main(String[] args) {

    }public int[] frontPiece(int[] nums) {
        int arr[]=new int[2];
        if(nums.length<=2){
            for(int i=0;i<nums.length;i++){
                arr[i]+=nums[i];
            }
        }for(int i=0;i<nums.length;i++){
            arr[i]+=nums[i];


        }arr[0]=nums[0];
        arr[1]=nums[1];
        return arr;

    }

}
