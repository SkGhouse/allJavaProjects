import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Find the given number is Even or Odd----->");
        System.out.print("enter the number = ");
        int n =sc.nextInt();
        System.out.println((n % 2 == 0)?"even":"odd");
    }
}