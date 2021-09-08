import java.time.Month;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String name;
        Scanner kb = new Scanner(System.in);
        System.out.print("Month:");
        int month = kb.nextInt();
        switch (month) {
            case 1:
                name = "january";
                System.out.println(name);
                break;
            case 2:
                name = "February";
                System.out.println(name);
                break;
            case 3:
                name = "March";
                System.out.println(name);
                break;
            default:
                name = "other Month";
                break;
        }
    }
}
