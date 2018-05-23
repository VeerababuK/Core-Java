package chapter1.cloning;

public class CompanyName implements Cloneable {

    private String name;

    public CompanyName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (CompanyName)super.clone();
    }

    public static void main(String[] args) {
        CompanyName companyName = new CompanyName("ValueLabs");
        try {
            CompanyName companyName1 = (CompanyName) companyName.clone();
            System.out.println(companyName1.getName());
        } catch (CloneNotSupportedException cnse) {
            cnse.fillInStackTrace();
        }
    }
}
