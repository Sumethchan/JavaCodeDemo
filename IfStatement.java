
/**
 * IfStatement
 */
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("age:");
        int age = kb.nextInt();
        if (age >= 15 && age <= 19) {
            System.out.println("teenager");
        } else if (age >= 20 && age <= 29) {
            System.out.println("youth");
        } else if (age >= 30 && age <= 39) {
            System.out.println("working age ");
        } else if (age >= 40 && age <= 59) {
            System.out.println("middle age ");
        } else if (age >= 60) {
            System.out.println("Elder ");
        } else {
            System.out.println("Age range not found ");
        }

        System.out.println("End program");
    }

}
