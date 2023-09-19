package javaJungsuk.OOP;

public class DrawShape {
    public static void main(String[] args) {

        //default value check
        Shape s = new Shape();
        s.draw();

        Point po = new Point();
        po.getXY();

        //Triangle
        Point[] pTriangle = { new Point (100, 100),
                new Point (140, 50),
                new Point (200, 100),
        };

        Triangle t = new Triangle(pTriangle);
        t.draw();

        //Circle
        Circle defaultC = new Circle();
        defaultC.draw();

        //Origin 150, 150, radius 50
        Point pointCenter = new Point(150, 150);
        Circle c = new Circle(pointCenter, 50);
        //Circle c = new Circle(new Point(150, 150), 50);
        c.draw();
    }
}

class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point() {
        this(0,0);
    }

    String getXY() {
        return "("+x+", "+y+")";
    }
}
class Triangle extends Shape {
    Point[] p = new Point[3];

    Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p]%s, p2=%s, p3=%s, color=%s]%n",
                p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}

class Circle extends Shape {
    Point center; //포함관계(Circle 클래스의 멤버변수로 Point 타입의 참조변수를 선언)
    int r;

    Circle() {
        this(new Point(), 100);
        //=this(new Point(0, 0), 100);
    }

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center=(%d, %d). r=%d, color=%s]%n",
                center.x, center.y, r, color);
    }
}
