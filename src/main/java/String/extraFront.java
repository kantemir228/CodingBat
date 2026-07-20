package String;

public class extraFront {
    public static void main(String[] args) {

    }public String extraFront(String str) {
        if(str.length()<0){
            return "";

        }else if(str.length()==1){
            return str+str+str;

        }else if(str.length()>=2){
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }return "";
    }

}
