public class User {
    private int y;
    private Base used;
    public User() {
        this.used = new Derived1();
        this.y = 10;
    }
    public void printX() { System.out.println(used.x); }
    public void printXAndY() {
        printX();
        used.printY(this.y);
    }
}
