import java.util.Scanner;
public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" \nWelcome to the Arithmetic Calculator");
        System.out.print(" Enter your 1st number: ");
        int n1= sc.nextInt();
        System.out.print(" Enter your 2nd number: ");
        int n2= sc.nextInt();
        System.out.print("Enter the Operation : ");
        String op =sc.next();
        Calculator(op,n1,n2);
    }
    public static void Calculator(String op,int n1,int n2){
        switch(op){
            case "+"-> System.out.println(n1 + n2);
            case "-"-> System.out.println(n1 - n2);
            case "*"-> System.out.println(n1 * n2);
            case "/"-> System.out.println(n1 / n2);
            default -> System.out.println("invalid operation");
        };
    }
}