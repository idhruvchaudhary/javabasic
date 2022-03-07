import java.util.*;

public class choice {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("enter value of a  :  ");
        a = sc.nextInt();

        System.out.println("enter value of b  :  ");
        b = sc.nextInt();

        System.out.println("(1) for sum");
        System.out.println("(2) for sub");
        System.out.println("(3) for mult");
        System.out.println("(4) for div");

        do {
            System.out.println("enter your choice :");
            c = sc.nextInt();

            if (c > 4 || c < 1) {
                System.out.println("sorry invalid choice");
                System.out.println("re enter your choice");
            }

        } while (c > 4 || c < 1);

        if (c == 1) {
            System.out.println("sum" + (a + b));
        }

        else if (c == 2) {
            System.out.println("sub==" + (a - b));
        }

        if (c == 3) {
            System.out.println("multi=" + (a * b));
        }

        if (c == 4) {
            System.out.println("div=" + (a / b));
        }
    }

}
