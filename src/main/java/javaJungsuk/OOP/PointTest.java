package javaJungsuk.OOP;

public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(10,20,30);
        p3.getLocation();
    }
}

class PointAgain {
    int x, y;

    PointAgain (int x, int y) {
        this.x = x;
        this.y = y;
    }

    void getLocation() {
        System.out.println("x: " + x + ", y: " + y);
    }
}

class Point3D extends PointAgain {
    int z;

    Point3D(int x, int y, int z) {
        super(x,y);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void getLocation() {
        System.out.println("x: " + x + ", y: "+ y + ",z: " + z);
    }
}
