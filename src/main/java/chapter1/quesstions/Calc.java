package chapter1.quesstions;

class Mid {
    public int findMid(int n1, int n2) {
        return (n1 + n2) / 2;
    }
}
public class Calc extends Mid {
    public static void main(String[] args) {
        int n1 = 22, n2 = 2;
        //insert code here.
        Calc c = new Calc(); int n3 = c.findMid(n1,n2);
        //int n3 = super.findMid(n1,n3);
        //Calc c = new Mid(); int n3 = c.findMid(n1, n2);
        //Mid m1 = new Calc(); int n3 = m1.findMid(n1, n2);
        //int n3 = Calc.findMid(n1, n2);
        System.out.print(n3);
    }
}
