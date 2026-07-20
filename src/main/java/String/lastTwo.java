package String;

public class lastTwo {
    public static void main(String[] args) {

    }public String lastTwo(String str) {
        if(str.length()==0||str.length()==1){
            return str;
        }return str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length() - 2);
    }

}
