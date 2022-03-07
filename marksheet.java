import java.util.*;

public class marksheet {

    public static void main(String args[]) {
        int a, b, c, d, e, tot, pr;

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("enter your maths marks : ");
            a = sc.nextInt();

            if (a > 100) {
                System.out.println("renter your marks");
            }

        } while (a > 100);

        do {
            System.out.println("enter your physics marks  : ");
            b = sc.nextInt();

            if (b > 100) {
                System.out.println("renter your marks");
            }

        } while (b > 100);
        do {
            System.out.println("enter your chamistry marks  : ");
            c = sc.nextInt();

            if (c > 100) {
                System.out.println("renter your marks");
            }
        } while (c > 100);

        do {
            System.out.println("enter your english marks  :  ");
            d = sc.nextInt();

            if (d > 100) {
                System.out.println("renter your marks");
            }
        } while (d > 100);

        do {
            System.out.println("enter your comp marks  :  ");
            e = sc.nextInt();

            if (e > 100) {
                System.out.println("renter your marks");
            }
        } while (e > 100);

        if (a < 33 || b < 33 || c < 33 || d < 33 || e < 33) {
            System.out.println("sorry you are fail");
        }

        /*
         * if (a > 100 || b > 100 || c > 100 || d > 100 || e > 100)
         * 
         * { System.out.println("invalid marks"); }
         */

        if (a >= 33 && b >= 33 && c >= 33 && d >= 33 && e >= 33)

        {
            tot = a + b + c + d + e;
            System.out.println("total martks  :  " + tot);

            // System.out.println("total marks : " + (a + b + c + d + e));

            pr = tot / 5;
            System.out.println("your percentage  :  " + pr);

            if (pr > 90) {
                System.out.println("your grade is A");
            }

            else if (pr > 80) {
                System.out.println("your grade is b");
            }

            else if (pr > 70) {
                System.out.println("your grade is c");
            }

            else if (pr > 50) {
                System.out.println("your grade is d");
            }

            else if (pr > 33) {
                System.out.println("your grade is e");
            }

            else {
                System.out.println("sorry you are fail  ");
            }
        }

    }

}
