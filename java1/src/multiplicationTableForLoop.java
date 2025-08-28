import java.util.Scanner;
public class multiplicationTableForLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER FOR THE TABLE = ");
        int n =sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+ (n*i));
        }
    }
}
