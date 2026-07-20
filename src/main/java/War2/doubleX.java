package War2;

public class doubleX {
    public static void main(String[] args) {

    }boolean doubleX(String str) {

        int index = str.indexOf("x");

        if (index == -1) {
            return false;
        }

        if (index + 1 < str.length() && str.charAt(index + 1) == 'x') {
            return true;
        }

        return false;
    }

}
