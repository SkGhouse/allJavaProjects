import java.util.Scanner;
public class gradesTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR MARKS : ");
        int n = sc.nextInt();
        System.out.println("Your marks come under '"+((n>=80)?"High":((n < 80) && (n >= 50))?"Moderate":"Low")+"' Category");
    }
}
