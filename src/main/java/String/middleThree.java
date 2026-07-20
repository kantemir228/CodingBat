package String;

public class middleThree {
    public static void main(String[] args) {

    }public String middleThree(String str) {
        int a = str.length() / 2;
        return str.substring(a - 1, a + 2);
    }

}
