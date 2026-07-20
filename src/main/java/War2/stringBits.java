package War2;

public class stringBits {
    public static void main(String[] args) {

    }public String stringBits(String str) {
        String nw="";
        for(int i =0;i<str.length();i++){
            if(i%2==0){
                nw+=str.charAt(i);
            }
        }
        return nw;
    }

}
