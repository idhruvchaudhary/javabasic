import java.util.*;

public class oddevensum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, a, esum = 1, osum = 1;

        System.out.println("enter the limit the number you have seprate the number odd even sum");
        a = sc.nextInt();

        System.out.print("\neven nember is=");
        for (i = 0; i <= a; i++) {

            if (i % 2 == 0) {

                System.out.print(i + ",");
                esum = esum + i;
            }
        }
        System.out.print("\neven no.sum =" + esum);

        System.out.print("\nodd nember is=");
        for (i = 0; i <= a; i++) {

            if (i % 2 == 1) {

                System.out.print(i + ",");
                osum = osum + i;
            }
        }
        System.out.print("\nsum of odd number =" + osum);

    }

}
