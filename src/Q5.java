/*
Write a recursive method
void replace(String s, char from, char to) that changes all occurrences of from in s to to.
For example, if s were "steve", and from == "e" and to == "a", s would become "stava".
 */
public class Q5 {

    public static void main(String[] args) {
        String s = "steve";
        char from = 'e';
        char to = 'a';
        replace(s, from, to);
    }

    public static void replace(String s, char from, char to) {
        if(s.charAt(0) == from) {
            if(s.length() == 1) {
                System.out.print(to);
            } else {
              //  s = to + s.substring(1);
                System.out.print(to);
                replace(s.substring(1), from, to);
            }

        } else {
            System.out.print(s.charAt(0));
            replace(s.substring(1), from, to);
        }
    }
}
