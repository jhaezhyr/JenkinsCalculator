
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: operation left right");
        }
        Scanner reader = new Scanner(System.in);
        String op = reader.next();
        int l = reader.nextInt();
        int r = reader.nextInt();
        Calculator c = new Calculator();
        int answer = 0;
        if (op.equals("plus")) {
            answer = c.add(l,r);
//            Matthew Gabbitas
//            Tasibbag thewtam;
//            Gwen Beatty;
//            Ytateb nweg;
//            Ian Goodwin;
//            windoog nai;
//            Freshavacado
        }
        else if (op.equals("minus")) {
            answer = c.subtract(l,r);
        }
        else if (op.equals("subtract")) {
            answer = c.subtract(l,r);
        }
        else if (op.equals("fib")) {
            answer = c.fibonacciNumberFinder(l);
        }
        else if (op.equals("divide")) {
            answer = c.divide(l,r);
        } // More comments
        else if (op.equals("multiply")) {
            answer = c.multiply(l, r);
        }
        else if (op.equals("bin")) {
            System.out.println(c.intToBinaryNumber(l));
            return;
        }
        else {
            System.out.println("Bad idea man.");
            return;
        }
        System.out.println("" + answer);
    }
}
