public class diagonalSum2DArr {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum !!");
        int[][] arr =arrayUtility.input2dArray();
        long sum =Sum(arr);
        System.out.println("Sum of diagonals is: "+ sum);
    }
    public static long Sum(int[][] arr){
        long leftSum =SumOfLeftDiagonal(arr);
        long rightSum=SumOfRightDiagonal(arr);
        long sum =leftSum+rightSum;
        if(arr.length % 2 !=0){
            int ind = arr.length/2;
            sum =sum-arr[ind][ind];
        }
        return sum;
    }
    public static long SumOfLeftDiagonal(int[][] arr){
        long sum =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i][i];
        }
        return sum;
    }
    public static long SumOfRightDiagonal(int[][] arr){
        long sum =0;
        for(int i=0;i<arr.length;i++){
            int col =arr.length-1-i;
            sum+=arr[i][col];
        }
        return sum;
    }
}
