package org.example;

public class diff21 {
    public static void main(String[] args) {

    }
    public int diff21(int n) {
        int raz=0;
        if(n>21){
            raz=(n-21)*2;
        }else{
            raz=21-n;
        }
        return raz;
    }

}
