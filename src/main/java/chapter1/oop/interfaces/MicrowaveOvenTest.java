package chapter1.oop.interfaces;

public class MicrowaveOvenTest {

    public static void main(String[] args) {

/*        IFBMicrowaveOven ifbMicrowaveOven = new IFBMicrowaveOven();
        ifbMicrowaveOven.startButtonPressed();
        ifbMicrowaveOven.display();*/

        MicrowaveOven microwaveOven = new SamsungMicrowaveOven();
        microwaveOven.startButtonPressed();


    }



    // EmployeeInterface -- getEmployeeDetails()
    // JDBC  --- getEmployeeDetails() { ... }
    // Hibernate --- getEmployeeDetails() { ... }
    // ORM - Hibernate - JPA -

}
