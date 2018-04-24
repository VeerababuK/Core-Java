package chapter1;

public class MathOperators {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;

        double myValue = a + b % d - c * d / b;
        System.out.println("myValue = " + myValue);

        myValue = a + (b % d) - ((c * d) / b);
        System.out.println("myValue = " + myValue);
    }
}
