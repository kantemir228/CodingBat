package org.example;

public class posNeg {
    public static void main(String[] args) {

    }public boolean posNeg(int a, int b, boolean negative) {
        if((a>0&&b<0)&&negative==false){
            return true;
        } else if((a<0&&b>0)&&negative==false){
            return true;
        }else if((a>0&&b>0)&&negative==true){
            return false;

        }else if((a<0&&b<0)&&negative==true){
            return true;

        }else{
            return false;
        }
    }

}
