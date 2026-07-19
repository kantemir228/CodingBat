package org.example;

public class parrotTrouble {
    public static void main(String[] args) {

    }public boolean parrotTrouble(boolean talking, int hour) {
        if(talking==true&&(hour<7||hour>20)){
            return true;
        }else if(talking==false&&hour<7){
            return false;

        }return false;

    }

}
