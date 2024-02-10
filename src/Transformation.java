import java.util.Scanner;
public class Transformation {
    public static void main(String[] args) {
        int intNumber = 4;
        System.out.println("Double value:" + (double) intNumber);

        double doubleNumber = 5.2;
        int transformedNumber = (int) doubleNumber;
        System.out.println("Integer value:" + transformedNumber );

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string value:");
        String userString = scan.nextLine();
        int transformedStr = Integer.parseInt(userString);
        System.out.println("Transformed string:" + transformedStr);

        System.out.print("Enter the integer value:");
        int userInt = scan.nextInt();
        String transformedString = Integer.toString(userInt);
        System.out.println("Transformed int:" + transformedString);
        scan.close();

    }
}
