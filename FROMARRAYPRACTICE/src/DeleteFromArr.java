import java.util.Scanner;
public class DeleteFromArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Array deletion program!!");
        int[] numArray=arrayUtility.inputArray();
        System.out.println("Enter the element you want to delete = ");
        int numDel = sc.nextInt();
        int[] newArray =deleteNum(numArray,numDel);
        System.out.println("here's your Array---->");
        arrayUtility.displayArray(newArray);
    }
    public static int[] deleteNum(int[] numArray, int numDel){
        int occ =ArrayOccurances.occur(numArray,numDel);
        if(occ == 0){
            return numArray;
        }
        int newSize =numArray.length-occ;
        int[] newArr =new int[newSize];
        int j =0;
        for(int i =0; i<numArray.length;i++){
            if(numArray[i]!=numDel){
                newArr[j]=numArray[i];
                j++;
            }
        }
        return newArr;
    }
}
