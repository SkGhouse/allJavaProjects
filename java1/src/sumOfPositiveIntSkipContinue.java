import java.util.Scanner;
public class sumOfPositiveIntSkipContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int size =sc.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0)
                continue;
            sum+= arr[i];
        }
        System.out.println("Sum of positive integers are = "+ sum);
    }
}
