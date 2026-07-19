package org.example;

public class backAround {
    public static void main(String[] args) {

    }public String backAround(String str) {
        char last=str.charAt(str.length()-1);
        if(str.length()<=1){
            return str+str+str;
        }
        return last+str+last;
    }


}
