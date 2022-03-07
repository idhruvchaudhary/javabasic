import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class formula {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int r, h, b, s, w;
        String d;

        System.out.println("(a) for find out area of circle");
        System.out.println("(b)for find out area of triangle");
        System.out.println("(c) for find out area of squere");
        System.out.println("(d) for find out area of rectangle");

        System.out.println("enter your choice");
        d = sc.next();

        if (d.equalsIgnoreCase("a")) {
            System.out.println("welcome to area of circle program");

            System.out.println("enter the redius ");
            r = sc.nextInt();

            System.out.println("area of circle of =" + (3.14 * r * r));
        }

        else if (d.equalsIgnoreCase("b")) {
            System.out.println("welcome to area of triangle ");

            System.out.println("enter the hight");
            h = sc.nextInt();

            System.out.println("enter the value of b");
            b = sc.nextInt();

            System.out.println("area of triangle =" + (h * b * 1 / 2));

        }

        else if (d.equalsIgnoreCase("c")) {
            System.out.println("welcome to area of square");

            System.out.println("enter the value of s ");
            s = sc.nextInt();

            System.out.println("area of square =" + (s * s));

        }

        else if (d.equalsIgnoreCase("d")) {
            System.out.println("welcome to area of rectangle program ");
            System.out.println("enter the value of h");
            h = sc.nextInt();

            System.out.println("enter the value of w");
            w = sc.nextInt();

            System.out.println("area of rectangle=" + (h * w));

        } else {
            System.out.println("sorry you choose wrong choice ");
        }

    }

}
