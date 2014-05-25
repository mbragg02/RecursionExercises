/*
Write a recursive method int countDigit(int n, int digit)to count the number of digits in a number n (n > 0)
that are equal to a specified digit.
For example, if the digit we’re searching for were 2 and the number we’re searching were 220, the answer would be 2.
 */
public class Q10 {

    public static void main(String[] args) {

        System.out.println(countDigit(2220, 2));

    }

    public static int countDigit(int n, int digit) {
        if (n < 10) {
            if (n == digit) {
                return 1;
            } else {
                return 0;
            }
        } else {

            int lastDigit = n % 10;
            int val = 0;

            if (lastDigit == digit) {
                val = 1;
            }

            return countDigit(n / 10, digit) + val;

        }

    }
}
