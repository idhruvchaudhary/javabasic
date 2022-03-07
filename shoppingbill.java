import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class shoppingbill {

    public static void main(String args[]) {
        int qty, pr, t, net, dis = 0;

        String cname, pname;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name");
        cname = sc.next();

        System.out.println("enter  product name");
        pname = sc.next();

        System.out.println("enter product price");
        pr = sc.nextInt();

        System.out.println("enter qtly");
        qty = sc.nextInt();

        t = qty * pr;
        System.out.println("your total bill is :" + t);

        if (t > 1500) {

            dis = t * 15 / 100;
            System.out.println("yah!! you got  " + dis + "  discount ");

        }

        else if (t > 1000) {
            dis = t * 10 / 100;
            System.out.println("yeh you got " + dis + " discount");
        }

        else if (t > 500) {
            dis = t * 5 / 100;
            System.out.println("yah!! you got " + dis + "discount");
        }

        else {
            System.out.println("sorry you got nathing discount");
        }
        net = t - dis;

        System.out.println("you paid only" + net);

        System.out.println("thank you for shopping  " + cname + " have a good day");

    }

}
