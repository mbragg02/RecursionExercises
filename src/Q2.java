
/*
A section of memory containing characters is divided into two sections, section a and section b,
that follow each other in memory, b after a. You are also supplied with the lengths of a and b.
Write a method that uses your stringReverse() method above to swap the two sections so that the section a follows section b.
 */
public class Q2 {

    public static void main(String[] args) {

        String aWord = "Hello";
        String bWord = "World";
        int aLength = aWord.length();
        int bLength = bWord.length();

        String ab = aWord + bWord;

        System.out.println(ab);
        System.out.println(memoryReverse(ab, aLength, bLength));
    }

    public static String memoryReverse(String str, int aLength, int bLength) {

        String result = Q1.stringReverse(str, aLength + bLength);
        result = Q1.stringReverse(result, aLength);
        result = Q1.stringReverse(result, bLength);
        return result;
    }


}
