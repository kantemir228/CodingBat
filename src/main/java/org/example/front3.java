package org.example;

public class front3 {
    public static void main(String[] args) {


    }public String front3(String str) {
        if(str.length()>3){
            return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
        }else{
            return str+str+str;
        }
    }

}
