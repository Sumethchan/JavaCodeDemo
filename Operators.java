/**
 * Operators
 */
public class Operators {
    public static void main(String[] args) {
        int topScore = 80;
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both the condition are true");
        }
    }
}