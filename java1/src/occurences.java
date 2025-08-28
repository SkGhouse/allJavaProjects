import java.util.Scanner;
public class occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        System.out.println("Enter the number you want to find the occurance ");
        int num =sc.nextInt();
        int[] arr = new int[size];
        for(int i= arr.length-1;i>=0;i--){
            System.out.print("enter your "+ (i+1)+ " Element : ");
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i <arr.length; i++){
                if(num ==arr[i]){
                    count++;

            }
        }
        System.out.println("the given number "+ num + " repeated for "+ count+ " times");
    }
}
