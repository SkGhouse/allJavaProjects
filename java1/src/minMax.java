import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR FIRST NUMBER: ");
        int n1 =sc.nextInt();
        System.out.print("ENTER YOUR SECOND NUMBER: ");
        int n2 =sc.nextInt();
        int min = minNum(n1,n2);
        System.out.println("The Minimum Number is  = " + min);
    }
    public static int minNum(int n1, int n2){
//        if(n1>n2){
//            return n2;
//        }else{
//            return n1;
//        }
        return ( n1 > n2 ) ? n2 : n1;
    }
}
