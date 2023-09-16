package javaJungsuk.OOP;

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
        //return a + b;
    }
    long subtract(long a, long b) {return a - b;}
    long multiply(long a, long b) {return a * b;}
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return a / (float) b;}

}

public class MyMathTest{
    public static void main (String args[])
    {
        MyMath mm = new MyMath();
        long value1 = mm.add(1L, 2L);
        long value2 = mm.subtract(5L, 3L);
        long value3 = mm.multiply(5L, 3L);
        double value4 = mm.divide(5L, 1L); //double로 casting
    }
}