import static java.lang.System.out;;

public class Shortcircuit {
    public static void main(String args[]) {
        OperatorEvalDemo();
    }

    public static void OperatorEvalDemo() {
        if (0 == 1 && 2 + 2 == 4) {
            out.println("(0 == 1 && 2 + 2 == 4) is true");
        } else {
            out.println("(0 == 1 && 2 + 2 == 4) is false");
        }

        out.println();

        if (2 + 2 == 4 || 0 == 1) {
            out.println("(2 + 2 == 4 || 0 == 1) is true");
        } else {
            out.println("(2 + 2 == 4 || 0 == 1) is false");
        }

        out.println();

        if (isFalse() && isTrue() && isTrue()) {

            out.println("(isFalse() && isTrue()) is true");
        } else {
            out.println("(isFalse() && isTrue()) is false");
        }

        out.println();

        if (isFalse() & isTrue()) {
            out.println("(isFalse() & isTrue()) is true");
        } else {
            out.println("(isFalse() & isTrue()) is false");
        }

        out.println();

        if (isTrue() || isFalse()) {
            out.println("(isTrue() || isFalse()) is true");
        } else {
            out.println("(isTrue() || isFalse()) is false");
        }

        out.println();

        if (isTrue() | isFalse()) {
            out.println("(isTrue() | isFalse()) is true");
        } else {
            out.println("(isTrue() | isFalse()) is false");
        }
    }

    public static boolean isTrue() {
        out.println("Executing isTrue");
        return true;
    }

    public static boolean isFalse() {
        out.println("Executing isFalse");
        return false;
    }
}