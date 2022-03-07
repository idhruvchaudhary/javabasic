import java.util.*;

public class switchconvert {

    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        String d;

        System.out.println("enter the value which you like to convert ");
        a = sc.nextInt();

        System.out.println("(a) for convert doller to ruppees");
        System.out.println("(b) for convert km to meter ");
        System.out.println("(c) for convert ruppees to doller");
        System.out.println("(d) for exit");

        System.out.println("enter your choice :");
        d = sc.next();

        switch (d) {
            case "a": {
                System.out.println("doller to ruppees =" + (a * 70));
                break;
            }

            case "b": {
                System.out.println("km to meter =" + (a * 1000));
                break;
            }

            case "c": {
                System.out.println("ruppees to doller =" + (a / 70));
            }

        }

    }

}
