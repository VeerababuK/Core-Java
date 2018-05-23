package chapter1.quesstions;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Time";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }
}
