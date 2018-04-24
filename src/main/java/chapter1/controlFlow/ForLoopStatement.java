package chapter1.controlFlow;

import chapter1.InputReader;

public class ForLoopStatement {
    public static void main(String[] args) {
        int n = InputReader.readIntFromLine(); // you have to provide value from the console.
        int loopCount = 0;

        // for loop
        for (int i = 0; i < n; i++) {
            //System.out.println("Index value = " + i);
            loopCount++;
        }
        System.out.println("Loop Count " + loopCount);

        // Nested for loop
        loopCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++, loopCount++) {
                //System.out.println("Index value i & j = " + i + " & " + j);
            }
        }
        System.out.println("Loop Count " + loopCount);
    }
}
