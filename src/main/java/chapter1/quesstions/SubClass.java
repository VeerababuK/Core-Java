package chapter1.quesstions;

class SuperClass {
    SuperClass(int x1) {
        System.out.println("Super");
    }
}
public class SubClass extends SuperClass {
    SubClass() {
        // Line n1
        //this(10);
        super(10);
        //SuperClass(10);
        //super.SuperClass (10);

        System.out.println("Sub 2");
    }
}