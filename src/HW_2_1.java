// https://docs.google.com/document/d/1sjgtl1dIcmbgezc-Z7tCCm3vFj5uSlkYX522O0dV_mE/edit

public class HW_2_1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);

        if (a % 2 == 0) {
            System.out.println("a is even.");
        } else {
            System.out.println("a is odd.");
        }
        if (b % 2 == 0) {
            System.out.println("b is even.");
        } else {
            System.out.println("b is odd.");
        }
    }
}
