package chapter1.controlFlow;

import chapter1.InputReader;

public class IfConditionalStatement {
    public static void main(String[] args) {
        String intValue = InputReader.readLine(); // you have to provide value from the console.
        int x = Integer.parseInt(intValue);

        if (x < 10) x = 10; // #1


        if (x < 10)         // #2
            x = 10;


        if (x < 10) {       // #3
            x = 10;
        }

        System.out.println("x value is " + x);
    }
}
