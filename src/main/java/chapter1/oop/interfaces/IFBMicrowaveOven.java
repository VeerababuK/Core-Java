package chapter1.oop.interfaces;

public class IFBMicrowaveOven implements MicrowaveOven {
    @Override
    public void startButtonPressed() {
        // implement how IFB will start their Microwave Oven... This will be specific to IFB...
    }

    public void display(){
        System.out.println("This is IFB implementation");
    }
}
