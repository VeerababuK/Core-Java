package chapter1.controlFlow;

import chapter1.InputReader;

public class NestedIfCondition {

    public static void main(String[] args) {
        int myValue = InputReader.readIntFromLine(); // you have to provide value from the console.

        // Nested if else
        if (myValue > 100) {
            if (true) {
                System.out.println("myValue is greater than 100");
            } else {
                System.out.println("this will never execute");
            }
        } else {
            System.out.println("myValue is with in the range");
        }

        // if else if else
        if (myValue == 100) {
            System.out.println("myValue is 100");
        } else if (myValue == 200){
            System.out.println("myValue is 200");
        } else {
            System.out.println("myValue is other value...");
        }

    }
}
