public class mergeSortedArr{
    public static void main(String[] args) {
        int[] numArr1=arrayUtility.inputArray();
        int[] numArr2=arrayUtility.inputArray();
        int[] merged =mergedArr(numArr1,numArr2);
        System.out.println("Your merged array is : ");
        arrayUtility.displayArray(merged);
    }
    public static int[] mergedArr(int[] numArr1,int[] numArr2){
int newSize =numArr1.length+numArr2.length;
int[] newArr =new int[newSize];
int i=0,j=0,k=0;
while(i<numArr1.length || j<numArr2.length){
    if(j == numArr2.length ||
            (i<numArr1.length && numArr1[i]<numArr2[j])){
        newArr[k]=numArr1[i];
        i++;
        k++;
    }else{
        newArr[k]=numArr2[j];
        j++;
        k++;
    }

}
return newArr;
    }
}