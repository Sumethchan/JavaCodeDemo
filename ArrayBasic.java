public class ArrayBasic {
    public static void main(String[] args) {
        int[] number = new int[10];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        System.out.println(number[4]);
        int[] num = { 10, 20, 30, 40, 50 };
        System.out.println(num[4]);
        num[4] = 500;
        System.out.println(num[4]);

    }
}
