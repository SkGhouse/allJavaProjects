import java.util.Scanner;
public class search2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the 2D Array Search!!");
        int[][] arr = arrayUtility.input2dArray();
        System.out.println("Now enter the number to Search = ");
        int n = sc.nextInt();
        boolean isfound = search2d(arr, n);
        if (isfound) {
            System.out.println("your number is found");
        } else {
            System.out.println("your number is not found");
        }
    }

    public static boolean search2d(int[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == n) {
                    return true;
                }
            }
        }
        return false;

    }
}

