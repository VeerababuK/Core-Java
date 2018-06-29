package chapter1.oop.inheritance;

public class Person {
    private String name;
    // age, gender, dob, address, phone etc


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*

                    Person
                        |
                    Employee
                        |
    Developer   ProductOwner    QualityAnalyst


    */
