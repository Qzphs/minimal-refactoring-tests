package printers;

import numbers.Base;
import numbers.Derived1;

public class User implements Printer {
    private int y;
    private int z;
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
    public void printZ() { System.out.println(this.z); }
}
