public class User {
    private int y;
    private Base used;
    public User() {
        this.used = new Derived1();
        this.y = 10;
    }
    public void printXAndY() {
        used.printX();
        System.out.println(this.y);
    }
}