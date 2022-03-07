import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, sum = 0, t, b;

        System.out.println("enter the value");
        a = sc.nextInt();
        b = a;
        while (a > 0) {
            t = a % 10;
            sum = sum + t * t * t;
            a = a / 10;
        }

        if (sum == b) {
            System.out.println("the number is armstrong");
        }

        else {
            System.out.println("the number is not armstrong");
        }

    }

}
