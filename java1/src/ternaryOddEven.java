import java.util.Scanner;
public class ternaryOddEven {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER: ");
    int n =sc.nextInt();
        System.out.println((n%2==0) ? "Even" : "Odd");
}
}
