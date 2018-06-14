package chapter1.oop;


abstract class X {
    public abstract void methodX();
}
interface Y{
    public void methodY();
}

abstract class Z extends X implements Y {
}

class Z1 extends X implements Y {
    public void methodX(){}
    public void methodY(){}
}

abstract class Z2 extends X implements Y {
    public void methodZ(){}
}