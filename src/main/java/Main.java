import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Calculator c = new Calculator();
        while (true) {
            try {
                String op = reader.next();
                int l = reader.nextInt();
                int r = reader.nextInt();
                int answer = 0;
                switch (op) {
                    case "plus":
                        answer = c.add(l, r);
                        //            Matthew Gabbitas
                        //            Tasibbag thewtam;
                        //            Gwen Beatty;
                        //            Ytateb nweg;
                        //            Ian Goodwin;
                        //            windoog nai;
                        //            Freshavacado
                        break;
                    case "subtract":
                        answer = c.subtract(l, r);
                        break;
                    case "fib":
                        answer = c.fibonacciNumberFinder(l);
                        break;
                    case "divide":
                        answer = c.divide(l, r);
                        break;
                    case "multiply":
                        answer = c.multiply(l, r);
                        break;
                    case "bin":
                        System.out.println(c.intToBinaryNumber(l));
                        continue;
                    case "exit":
                        System.out.println("See yah!");
                        return;
                    default:
                        System.out.println("Bad idea man.");
                        continue;
                }
                System.out.println("" + answer);
            } catch (Exception ex) {
                System.out.println("Usage: operation left right");
            }
        }
    }
}
