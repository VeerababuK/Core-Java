package chapter1;

public class DeclaringPrimitiveDataType {
    // instance variables
    float initialValue;
    int returnValue, index = 2;
    double gamma = 1.2, brightness;
    boolean valueOk = false;

    public static void main(String[] args) {
        DeclaringPrimitiveDataType dpdt = new DeclaringPrimitiveDataType();

        System.out.println("initialValue = " + dpdt.initialValue);
        System.out.println("returnValue = " + dpdt.returnValue);
        System.out.println("index = " + dpdt.index);
        System.out.println("gamma = " + dpdt.gamma);
        System.out.println("brightness = " + dpdt.brightness);
        System.out.println("valueOk = " + dpdt.valueOk);

        // Declaration
        //int index = 1.2;				// compiler error
        //boolean returnOk = 1;		    // compiler error
        double fiveFourth = 5/4;		// no errors!
        float ratio = 5.8f;				// correct
        double fiveFourths = 5.0/4.0;	// correct

        System.out.println("fiveFourth = " + fiveFourth);
        System.out.println("ratio = " + ratio);
        System.out.println("fiveFourths = " + fiveFourths);

    }
}
