import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("age:");
        int age = kb.nextInt();
        if (age <= 15) {
            if (age == 15) {
                System.out.println("middle school");
                System.out.println("Secondary 3");
            } else if (age == 14) {
                System.out.println("middle school");
                System.out.println("Secondary 2");
            } else if (age == 13) {
                System.out.println("middle school");
                System.out.println("Secondary 1");
            } else {
                System.out.println("Primary");
            }
        } else {
            System.out.println("High school");
        }
    }
}
