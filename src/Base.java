public class Base {
    protected int x;
    public Base() { this.x = 0; }
    public void printX() { System.out.println(this.x); }
    public void printXTwoTimes() {
        printX();
        printX();
    }
}
