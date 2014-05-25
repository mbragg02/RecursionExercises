/*
Write a method to recursively print out an integer in any base from base 2 to base 9.
 */
public class Q9 {

    public static void main(String[] args) {
        int base = 2;
        int value = 75;
        printBase(value, base);
    }

    public static void printBase(int num, int base) {

        if (num > 0) {
            num = Math.abs(num);
        }

        int val = num / base;

        if (val > 0) {
            printBase(val, base);
        }
        System.out.print(num % base);

    }
}
