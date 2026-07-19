package Array;

public class biggerTwo {
    public static void main(String[] args) {

    }public int[] biggerTwo(int[] a, int[] b) {
        int sum1=0;
        int sum2=0;
        for(int  num:a){
            sum1+=num;
        } for(int  num:b){
            sum2+=num;
        }
        if(sum1>sum2){
            return a;
        }else if(sum2>sum1){
            return b;
        }return a;

    }

}
