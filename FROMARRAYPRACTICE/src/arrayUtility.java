import java.util.Scanner;
public class arrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter the element number " + (i + 1) + ";");
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    public static void displayArray(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i] + " ");
        }
        System.out.println();
    }

    public static int[][] input2dArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows in array: ");
        int rows = sc.nextInt();
        System.out.print("enter the number of columns in array: ");
        int columns = sc.nextInt();
        int[][] numArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Please enter the number of rows = " + (i + 1) + " ," + " and columns = " + (j + 1) + " ;");
                numArray[i][j] = sc.nextInt();
            }
        }
        return numArray;

    }
}