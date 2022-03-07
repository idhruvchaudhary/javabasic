import java.util.*;

public class choiceswitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        String c;

        System.out.println("enter the value of a :");
        a = sc.nextInt();

        System.out.println("enter the valuer of b :");
        b = sc.nextInt();

        System.out.println("(a) for sum ");
        System.out.println("(b) for sub ");
        System.out.println("(c) for multi ");
        System.out.println("(d) for div");

        System.out.println("enter your choice  : ");
        c = sc.next();

        switch (c) {

            case "a": {
                System.out.println("sum is" + (a + b));
                break;
            }

            case "b": {
                System.out.println("sub is" + (a - b));
                break;
            }

            case "c": {
                System.out.println("multi is " + (a * b));
                break;
            }

            case "d": {
                System.out.println("div is " + (a / b));
                break;
            }

            default: {
                System.out.println("invalid your choice");
            }
        }

    }

}
