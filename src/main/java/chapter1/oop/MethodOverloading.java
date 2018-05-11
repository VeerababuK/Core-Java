package chapter1.oop;

public class MethodOverloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double c, double d) {
        return c + d;
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.add(10, 20);
        methodOverloading.add(10.5, 20);
        methodOverloading.add(10, 20, 2);
    }
}


