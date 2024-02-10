import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        calculateExamResult(scan);
        calculator(scan);
        calculateDay(scan);
        calculatePrice(scan);

        scan.close();
    }

    public static void calculateExamResult(Scanner scan) {
        System.out.print("Enter the exam note:");
        double note = scan.nextDouble();
        if (note >= 50){
            System.out.println("Başarılı");
        } else {
            System.out.println("Başarısız");
        }
    }

    public static void calculator(Scanner scan){
        System.out.print("Enter the first number:");
        double firstNumber = scan.nextDouble();
        System.out.print("Enter the second number:");
        double secondNumber = scan.nextDouble();
        System.out.print("Enter the operation (+, -, *, /):");
        char operator = scan.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("The result:" + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("The result:" + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("The result:" + result);
                break;
            case '/':
                switch ((int) secondNumber) {
                    case 0:
                        System.out.println("The denominator cannot be equal to zero");
                        break;
                    default:
                        result = firstNumber / secondNumber;
                        System.out.println("The result:" + result);
                        break;
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static void calculateDay(Scanner scan) {
        System.out.print("Enter the number of day:");
        int dayNumber = scan.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    public static void calculatePrice(Scanner scan) {
        System.out.print("Enter the price:");
        double price = scan.nextDouble();
        System.out.print("Enter the bargain %:");
        double bargainRate = scan.nextDouble();
        if (price >= 100){
            double discount = (price * bargainRate) / 100;
            double salePrice = price - discount;
            System.out.println("Net Price:" + salePrice);
        } else{
            System.out.println("Net Price:" + price);
        }
    }
}
