/*
The classic fibonacci problem, where the next term in the sequence is the sum of the previous two terms, is often called fib2.
One could also imagine a sequence fibN, where N is the number of previous terms to sum. Write this method recursively.
 */
public class Q12 {

    public static void main(String[] args) {

        fib2(0, 1);

    }

    public static void fib2(int f1, int f2) {

        if (f1 > 1000) return;

        System.out.println(f1);

        fib2(f2, f1 + f2);

    }
}
