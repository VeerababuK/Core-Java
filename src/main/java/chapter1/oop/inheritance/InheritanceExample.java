package chapter1.oop.inheritance;

public class InheritanceExample {

    public static void main(String[] args) {

        Person po = new ProductOwner();
        Person dev = new Developer();
        Person qa = new QualityAnalyst();

        dev.setName("Arun");
        ((Developer) dev).setSalary(100000);
        ((ProductOwner) po).setSalary(100000);
        ((QualityAnalyst) qa).setSalary(100000);

        char value = 'a';
        Character charValue2 = new Character ('\'');

    }
}
