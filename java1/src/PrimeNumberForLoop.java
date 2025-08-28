import java.util.Scanner;
public class PrimeNumberForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number = ");
        int n = sc.nextInt();
        int count=0;
        for(int i =1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count>2){
            System.out.println("it is not a 'prime number' ");
        }else{
            System.out.println("Given Number "+n+" is a 'Prime NUmber'");
        }
    }
}
