package chapter1;

public class Simple {
    // Member variable can hold data
    private String simpleName;
    private String description;

    // Constructor
    public Simple(String simpleName) {
        this.simpleName = simpleName;
    }

    // Method or operation, use the data to compute
    public void display(){
        System.out.println(simpleName);
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        Simple simple = new Simple("Simple");
        simple.display();
    }
}
