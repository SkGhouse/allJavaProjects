import java.util.Scanner;

public class monthTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" \nWelcome to the Day of the week Detector");
        System.out.print(" Enter your Month number: ");
        int Month = sc.nextInt();
        returnMon(Month);
    }
        public static void returnMon(int Month){
            switch (Month) {
                case 1:
                    System.out.println("  January");
                    break;
                case 2:
                    System.out.println("  February");
                    break;
                case 3:
                    System.out.println("  March");
                    break;
                case 4:
                    System.out.println("  April");
                    break;
                case 5:
                    System.out.println("  May");
                    break;
                case 6:
                    System.out.println("  June");
                    break;
                case 7:
                    System.out.println("  July");
                    break;
                case 8:
                    System.out.println("  August");
                    break;
                case 9:
                    System.out.println("  September");
                    break;
                case 10:
                    System.out.println("  October");
                    break;
                case 11:
                    System.out.println("  November");
                    break;
                case 12:
                    System.out.println(" December");
                    break;
                default:
                    System.out.println("  Invalid month");
                    break;
        }
    }
}
//import java.util.Scanner;
//
//public class monthTernary {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nWelcome to the Month Detector");
//        System.out.print("Enter your Month number: ");
//        int Month = sc.nextInt();
//        String MonthName = returnMon(Month);
//        System.out.println(MonthName);
//        sc.close();
//    }
//
//    public static String returnMon(int Month) {
//        return switch (Month) {
//            case 1 -> "January";
//            case 2 -> "February";
//            case 3 -> "March";
//            case 4 -> "April";
//            case 5 -> "May";
//            case 6 -> "June";
//            case 7 -> "July";
//            case 8 -> "August";
//            case 9 -> "September";
//            case 10 -> "October";
//            case 11 -> "November";
//            case 12 -> "December";
//            default -> "Invalid month";
//        };
//    }
//}



