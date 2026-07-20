package String;

public class deFront {
    public static void main(String[] args) {

    }public String deFront(String str) {
        if (str.equals("")){
            return "";
        }else if (str.substring(0,1).equals("a") && str.substring(1,2).equals("b")){
            return str;
        }else if (str.substring(0,1).equals("a") && (!str.substring(1,2).equals("b"))){
            return str.substring(0,1)+str.substring(2);
        }else if (!str.substring(0,1).equals("a") && (str.substring(1,2).equals("b"))){
            return str.substring(1);

        } return (str.substring(2));

    }
}
