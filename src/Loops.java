import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean createTable = true;
        while (createTable) {
            System.out.print("Enter the line number:");
            int lineNumber = scan.nextInt();
            System.out.print("Enter the column number:");
            int columnNumber = scan.nextInt();
            for(int i = 1; i <= lineNumber; i++){
                for(int j = 1; j <= columnNumber; j++){
                    int multiplication = i * j;
                    System.out.print(multiplication + "\t");
                }
                System.out.println();
            }
            System.out.print("Do you want to create multiplication table? (yes/no):");
            String answer = scan.next();
            if(!answer.equalsIgnoreCase("yes")){
                createTable = false;
            }
        }
        scan.close();
    }
}
