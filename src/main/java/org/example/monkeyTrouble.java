package org.example;

public class monkeyTrouble {
    public static void main(String[] args) {

    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile==true&&aSmile==false){
            return false;
        }else if(aSmile==false&&bSmile==false){
            return true;
        } else if(aSmile==true&&bSmile==true){
            return true;
        }
        return false;
    }


}
