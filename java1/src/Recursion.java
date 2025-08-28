import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to do the factorial = ");
        int n =sc.nextInt();
        long fact = factorial(n);
        System.out.print("The factorial of the given number is = "+ fact);
    }
    public static long factorial(int n){
        System.out.println("Function called for " + n);
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
//    public static long factorialNum(long n){
//        long result =1;
//        for(int i=1;i<=n;i++){
//            result *= i;
//        }
//        return result;
//    }
}
