import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String password;
        do{
            System.out.println("enter your valid password ");
            password =sc.next();

        }while(!isValidPassword(password));
        System.out.println("Thank you for entering a valid password !!!");
    }
    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
