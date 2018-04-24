package chapter1.controlFlow;

import chapter1.InputReader;

public class DoWhileStatement {
    public static void main(String[] args) {
        int response = 9; // initialized with value...
        int times = 0;

        // do while statement
        do {
            times++;
            System.out.println("Response " + response + " Times " + times);
            response = InputReader.readIntFromLine();
        } while (response == 1);

        System.out.println("Response " + response + " Times " + times);
    }
}
