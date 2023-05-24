public class Derived1 extends Base {
    public Derived1() { super(); }
    public Derived1(int x) {
        super();
        this.x = x;
    }
    public void printXTwoTimes() {
        printX();
        printX();
    }
}
