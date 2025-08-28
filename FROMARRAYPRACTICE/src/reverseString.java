public class reverseString {
    public static void main(String[] args) {
        char[] numArr= {'a','p','p','l','e'};
        for(int i=0;i<numArr.length/2;i++){
            if (numArr[i] != numArr[(numArr.length-1)-i]){
                arrayUtility.displayArray(numArr);

            }
        }

    }
}
