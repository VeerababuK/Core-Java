package chapter1;

public class HelloWorld {
    int x;
    boolean b;
    String z;
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int y;
        y = 2;
        System.out.println(y);
        String x = 34 + "" ; // "false";

        HelloWorld helloWorld = new HelloWorld();

        System.out.println(helloWorld.x);
        System.out.println(helloWorld.b);
        System.out.println(helloWorld.z);

    }
}

class HelloWorld1 {
    public static void main(String[] args) {
        HelloWorld1 hw = new HelloWorld1();
        hw.method1();
        hw.method1("Gopal");

        float i=4;
        float j=2;
         /*double z=i+j;
         long x=i+j;
         int y=i+j;
         byte zz=i+j;
*/
    }

    void method1() {
        System.out.println("HW");
    }

    void method1(String name) {
        System.out.println("HW " + name);
    }
}