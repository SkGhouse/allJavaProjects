import java.util.Scanner;

public class exitOnExitKw {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("enter a keyword  = ");
            String command = sc.next();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("bye ........ bye ..........;) ");
    }
}
