public class isSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array sorting arena !!");
        int[] numArray = arrayUtility.inputArray();
        boolean inc = isIncreasing(numArray);
        boolean dec = isDecreasing(numArray);
        if (inc || dec) {
            System.out.println("The array is sorted  :)");
        } else {
            System.out.println("The Array is Unsorted  :(");
        }
    }

    public static boolean isIncreasing(int[] numArray) {
        for (int i = 1; i < numArray.length; i++)
            if (numArray[i] < numArray[i - 1])
                return false;
        return true;
    }

    public static boolean isDecreasing(int[] numArray) {
        for (int i = 1; i < numArray.length; i++)
            if (numArray[i] > numArray[i - 1])
                return false;
        return true;
    }
}