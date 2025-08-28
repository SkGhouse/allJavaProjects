import java.util.Scanner;
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = arrayUtility.inputArray();
        int max=Max(numArray);
        int min =Min(numArray);
        System.out.println("Maximum number in the Array is = "+max);
        System.out.println("Minimum number in the Array is = "+min);
    }
    public static int Max(int[] numArray){
        if(numArray.length==0){
            return Integer.MIN_VALUE;
        }
        int max =numArray[0];
        for(int i =1;i<numArray.length;i++){
            if(max < numArray[i])
                max =numArray[i];
        }
       return max;
    }
    public static int Min(int[] numArray){
       int min =numArray[0];
        int i=1;
        while(i<numArray.length){
            if(min > numArray[i])
                min = numArray[i];
            i++;
        }
        return min;
    }
}
