package Array;

public class maxTriple {
    public static void main(String[] args) {

    }public int maxTriple(int[] nums) {
        int first=nums[0];
        int sred=nums[nums.length/2];
        int last=nums[nums.length-1];
        if(first>sred&&first>last){
            return first;
        }
        else if(first<sred&&sred>last){
            return sred;
        }
        return last;
    }

}
