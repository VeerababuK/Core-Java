package chapter1.quesstions;

public class ComputeSum {

    private int x;
    private int y;
    private int sum;
    public ComputeSum (int nx, int ny) {
        x = nx; y =ny;
        updateSum();
    }
    public void setX(int nx) { x = nx; updateSum();}
    public void setY(int ny) { x = ny; updateSum();}
    void updateSum() { sum = x + y;}


}

class TestOne {
    public static void main(String[] args) {
        ComputeSum cs = new ComputeSum(10, 20);
        cs.updateSum();
    }
}
