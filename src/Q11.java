/*
 * Write a method to recursively compute xn
 */
public class Q11 {

    public static void main(String[] args) {

        System.out.println(xn(2, 15));

    }

    public static int xn(int x, int n) {


        if(n == 0) {
            return 1;
        }

        return xn(x, n - 1) * x;

    }
}
