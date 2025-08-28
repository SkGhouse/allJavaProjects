import java.util.Scanner;
public class maxArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array");
        int size=sc.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter your "+(i+1)+" number = ");
            arr[i] = sc.nextInt();
        }
        int max =Integer.MIN_VALUE;
        for(int num : arr){
          if(max<num){
              max=num;
          }
        }
        System.out.println("maximum number is : "+ max);
    }
}