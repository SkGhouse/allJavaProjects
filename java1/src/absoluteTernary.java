import java.util.Scanner;
public class absoluteTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER: ");
        int n =sc.nextInt();
        System.out.println( "Absolute value of given number is " + ((n >= 0) ? n : -n));
    }
}
