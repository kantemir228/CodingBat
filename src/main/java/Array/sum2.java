package Array;

public class sum2 {
    public static void main(String[] args) {

    }public int sum2(int[] nums) {
        int result=0;
        for(int num:nums){
            if(nums.length>2){
                result=nums[0]+nums[1];
            }else{
                result+=num;
            }
        }
        return result;
    }

}
