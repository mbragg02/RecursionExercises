/*
Write a method countSpaces(String s) that counts the number of whitespace characters that appear in a string.
 */
public class Q3 {
    public static void main(String[] args) {
        String s = "hello my name is Q3";
        System.out.println(countSpaces(s));

    }

    public static int countSpaces(String s) {

        if (s.length() == 0) {
            return 0;
        }

        if(Character.isSpaceChar(s.charAt(0))) {

            return 1 + countSpaces(s.substring(1));
        } else {
            return countSpaces(s.substring(1));
        }

    }
}
