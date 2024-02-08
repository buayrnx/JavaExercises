import java.util.Base64;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Basit Hesaplamalar
        System.out.print("Enter the first number:");
        double firstNumber = scan.nextFloat();
        System.out.print("Enter the second number:");
        double secondNumber = scan.nextFloat();
        double summation = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;
        System.out.println("The result of summation:" + summation);
        System.out.println("The result of subtraction:" + subtraction);
        System.out.println("The result of multiplication:" + multiplication);
        System.out.println("The result of division:" + division);


//        Üçgenin Alanı
        System.out.print("Enter the base:");
        System.out.print("Enter the height:");
        double base = scan.nextFloat();
        double h = scan.nextFloat();
        double area = (base * h) /2 ;
        System.out.println("The area of the triangle" + area);



//        Mantıksal İfadeler
        System.out.print("Enter the number:");
        double number = scan.nextFloat();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is 0");
        }



//        Kullanıcı Girişi ve Doğrulama
        System.out.print("Enter username:");
        String userName = scan.nextLine();
        System.out.print("Enter password:");
        String password = scan.nextLine();
        String userNameData = "buayrn";
        String passwordData = "busess548";
        if (userName.equals(userNameData) && password.equals(passwordData)) {
            System.out.println("Successfully logged in");
        } else {
            System.out.println("Incorrect entry");
        }
        scan.close();
    }
}