
public class Variable {
    public static void main(String[] args) {
        /*
         * int number1; boolean status; char alphabet; float number2; double number3;
         */
        // Global variable
        int number1 = 10;
        float number2 = 20.5f;
        final int NUM1 = 20;
        final float NUM2 = 40.5f;
        int a = 0, b = 1, c = 3;
        number1 = 50;
        // NUM1 = 30;

        {
            int d = 500;
            System.out.println(d);
            // System.out.println(c);
        }

        System.out.println(number1 + number2);
        System.out.println("number = " + number2);
        System.out.println("number = " + c);
        System.out.println(NUM1);
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

        // System.out.println(d);
        //////////// small to large//////////////////////////////////////////
        /*
         * int numInt = 10; double numDouble = numInt; System.out.println(numInt);
         * System.out.println(numDouble);
         */
        ///////////// large size to small size////////////////////////////
        /*
         * double numDouble = 10.0; int numInt = (int) numDouble;
         * System.out.println(numInt); System.out.println(numDouble);
         */
        ///////////////// String////////////////////////////////////////////////////
        String a1 = "ABC", b1 = "200";
        // System.out.println(a1);

        // String => int//
        /*
         * int c1; c1 = Integer.parseInt(b1); c1 = c1 + 100; System.out.println(c1); //
         * String => Double// double d1; d1 = Double.parseDouble(b1); d1 = d1 + 5.5;
         * System.out.println(d1); // Interger => String int n1 = 100; String age =
         * String.valueOf(n1); System.out.println(age);
         */
        ////////// check data type////////////////////////
        Integer a2 = 70;
        double b2;
        String c2 = "Hello word";
        boolean d2;
        char e2;
        float f2;
        // true / false
        boolean result = a2 instanceof Integer;
        System.out.println(result);
    }

}
