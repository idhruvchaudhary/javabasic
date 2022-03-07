//import java.util.*;

public class armstrong1to1000 {

    public static void main(String args[]) {
        int i, a, sum = 0, x = 0;
        a = x;

        for (i = 0; i <= 1000; i++) {
            sum = 0;
            a = i;
            while (a > 0) {
                sum = sum + (a % 10) * (a % 10) * (a % 10);
                a = a / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }

        }
    }

}
