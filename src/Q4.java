/*
A palindrome is a sequence of characters or numbers that looks the same forwards and backwards.
For example, "Madam, I’m Adam" is a palindrome because it is spelled the same reading it from
front to back as from back to front. The number 12321 is a numerical palindrome.
Write a method that takes a String as its formal parameter and recursively determines whether the string is a palindrome.
 */
public class Q4 {
    public static void main(String[] args) {
        String s = "helleh";
        System.out.println(palindromeChecker(s));

    }

    public static boolean palindromeChecker(String s) {

        if(s.isEmpty() || s.length() == 1) {
            return true;
        }



        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            return palindromeChecker(s.substring(1, s.length() - 1));
        } else {
            return false;
        }

    }
}
