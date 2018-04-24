package chapter1.controlFlow;

import chapter1.InputReader;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        int myValue = InputReader.readIntFromLine(); // you have to provide value from the console.

        switch (myValue) {
            case 1: // we can not have duplicate label. i.e. we can have another case 1
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Default");
        }
    }
}
