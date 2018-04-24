package chapter1.controlFlow;

import chapter1.InputReader;

public class WhileStatement {
    public static void main(String[] args) {
        int response = InputReader.readIntFromLine(); // you have to provide value from the console.
        int times = 0;

        // while statement
        while (response == 1) { // pre-condition to enter the loop response should be 1...
            times++;
            System.out.println("Response " + response + " Times " + times);
            response = InputReader.readIntFromLine();
        }

        System.out.println("Response " + response + " Times " + times);
    }
}
