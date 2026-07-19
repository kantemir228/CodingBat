package org.example;

public class startOz {
    public static void main(String[] args) {

    }
    public String startOz(String str) {
        if(str.length()>=2&&str.substring(0,2).equals("oz")){
            return "oz";
        }
        if(str.length()>=1&&str.charAt(0)=='o'){
            return "o";
        } if(str.length()>=2&&str.charAt(1)=='z'){
            return "z";
        }return"";
    }

}
