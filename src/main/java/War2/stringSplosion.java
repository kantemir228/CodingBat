package War2;

public class stringSplosion {
    public static void main(String[] args) {

    }public String stringSplosion(String str) {
        String nw="";
        for(int i=0;i<str.length();i++){

            nw=nw+str.substring(0,i+1);
        }
        return nw;
    }

}
