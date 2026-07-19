package org.example;

public class max1020 {
    public static void main(String[] args) {

    }public int max1020(int a, int b) {
        int max=a;
        if((a<=20&&a>=10)&&(b<=20&&b>=10)){
            if(b>a){
                max=b;
            }return max;
        }else if((a<=20&&a>=10)){
            return a;
        }else if((b<=20&&b>=10)){
            return b;
        }
        return 0;
    }

}
