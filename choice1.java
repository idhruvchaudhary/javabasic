import java.util.*;

//import javax.lang.model.util.ElementScanner14;

public class choice1 {

    public static void main(String rgs[]) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        String c, ch;

        System.out.println("enter value of a  :  ");
        a = sc.nextInt();

        System.out.println("enter value of b  :  ");
        b = sc.nextInt();

        System.out.println("(a) for sum");
        System.out.println("(b) for sub");
        System.out.println("(c) for mult");
        System.out.println("(d) for div");

        do {
            System.out.println("enter your choice :");
            c = sc.next();

            if (c.equals("a") || c.equals("A")) {
                System.out.println("sum" + (a + b));
            }

            else if (c.equalsIgnoreCase("b")) {
                System.out.println("sub==" + (a - b));
            }

            else if (c.equals("c")) {
                System.out.println("multi=" + (a * b));
            }

            else if (c.equals("d")) {
                System.out.println("div=" + (a / b));
            }

            else {
                System.out.println("your choice is invalid");
            }
            System.out.println("Do you want to continue program?(y/n)");
            ch = sc.next();

        } while (ch.equalsIgnoreCase("y"));

    }
}