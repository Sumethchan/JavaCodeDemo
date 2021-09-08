
/**
 * InputTutorial
 */

import java.util.Scanner;

class InputTutorial {

    public static void main(String[] args) {
        // Scanner class declaration for get value from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:");
        String name = sc.nextLine();// get String from keyboard => name
        System.out.print("Year:");
        int year = sc.nextInt();// get Int from keyboard => year
        System.out.println("Your name:" + name);
        System.out.println("Year:" + year);

    }
}