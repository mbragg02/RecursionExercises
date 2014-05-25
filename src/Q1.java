/*
Write a static method stringReverse() that takes a string and the length of the string as arguments,
as its formal parameters, and returns the same string with its characters in the stringReverse order.
 */
public class Q1 {

    public static void main(String[] args) {
        String word = "hello";
        System.out.println(stringReverse(word, word.length()));

    }

    public static String stringReverse(String str, int length) {

//        if(str == null || str.length() == 0) {
//            return "";
//        }

        if (length == 0) {
            return str;
        } else {
            return stringReverse(str.substring(1), --length) + str.charAt(0);
        }

    }
}
