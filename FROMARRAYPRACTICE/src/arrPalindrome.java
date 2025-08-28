public class arrPalindrome {
    public static void main(String[] args) {
        System.out.println("welcome to palindrome array verification centre...;)");
        int[] numArr =arrayUtility.inputArray();
           boolean palin = ispalindrome(numArr);
           if(palin){
               System.out.println("yes");
           }else{
               System.out.println("no");
           }
    }
    public static boolean ispalindrome(int[] numArr){
        for(int i=0;i<numArr.length/2;i++){
            if (numArr[i] != numArr[(numArr.length-1)-i]){
                return false;
            }
        }
        return true;

    }
}
