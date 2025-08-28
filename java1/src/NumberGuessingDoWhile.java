import java.util.Scanner;
class NumberGuessingDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5,guess,count=0;
        System.out.println("Welcome to the Guess The Number Game !!!");
        do {
            System.out.println("Guess a Number");
            guess = sc.nextInt();
            count++;
        }while(num != guess);
        System.out.println("Wow ! you did great after "+ count + " times!!!");
    }
}
