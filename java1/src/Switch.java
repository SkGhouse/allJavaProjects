import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" \nWelcome to the Day of the week Detector");
        System.out.print(" Enter your day in number: ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("  Monday");
                break;
            case 2:
                System.out.println("  Tuesday");
                break;
            case 3:
                System.out.println("  Wednesday");
                break;
            case 4:
                System.out.println("  Thursday");
                break;
            case 5:
                System.out.println("  Friday");
                break;
            case 6:
                System.out.println("  Saturday");
                break;
            case 7:
                System.out.println("  Holiday");
                break;
            default:
                System.out.println("  Invalid day");
                break;


        }
    }
}
