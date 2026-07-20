package String;

public class frontAgain {
    public static void main(String[] args) {

    }public boolean frontAgain(String str) {
        if(str.length()<2){
            return false;

        }else if (str.length()==2){
            return true;
        }else if(str.substring(0,2).equals(str.substring(str.length()-2))){
            return true;
        }return false;
    }

}
