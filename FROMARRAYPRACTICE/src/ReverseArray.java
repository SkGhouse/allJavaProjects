public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ARRAY REVERSAL");
        int[] numArray =arrayUtility.inputArray();
        reverse(numArray);
        arrayUtility.displayArray(numArray);

    }
    public static void reverse(int[] numArray){
        for(int i =0;i<numArray.length/2;i++){
            int swap =numArray[i];
            numArray[i]=numArray[(numArray.length-1)-i];
            numArray[(numArray.length-1)-i]=swap;
        }
    }
}
