import java.util.Scanner;
public class ArrayOccurances {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] numArray =arrayUtility.inputArray();
        System.out.print("Now enter the number you want to find : ");
        int num = sc.nextInt();
        int occurences =occur(numArray,num);
        System.out.println("The number "+num+" appeared in the array for "+occurences+" times.");
    }
    public static int occur(int[] numArray,int num){
        int count =0;
        for(int i=0;i<numArray.length;i++){
            if(numArray[i]==num){
                count++;
            }
        }
        return count;
    }
}
