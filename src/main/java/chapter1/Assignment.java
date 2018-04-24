package chapter1;

public class Assignment {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3; // All java assignment are right associative
        a = b = c;

        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
}
