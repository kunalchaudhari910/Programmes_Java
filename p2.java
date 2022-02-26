import java.util.Scanner;

public class p2{
    public static void main(String args[]) {

        System.out.println("Enter terms to be printed");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        System.out.println("The" + ch + " terms of fibanocci numbers are-");
        int a, b, s, n;
        a = b = 1;
        for (n = 1; n <= ch; n++) {
            System.out.println(a);
            s = a + b;
            a = b;
            b = s;
        }
    }
}