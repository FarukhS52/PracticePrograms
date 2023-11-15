public class ShapesArea {
    public double getAreaOfCircle(int radius) {
        return 3.14 * radius * radius;
    }
    public double getAreaOfSquare(int side) {
        return side * side;
    }
    public double getAreaOfRectangle(int width, int length) {
        return width * length;
    }
    public double getAreaOfTriangle(int base, int height) {
        return 0.5*base * height;
    }
    public double getAreaOfParallelogram(int base, int height) {
        return base * height;
    }
    public double getAreaOfTrapezoid(int base1,int base2, int height) {
        return 0.5* (base1+base2) * height;
    }
    public double getAreaOfEllipse(int semiMinorAxis, int semiMajorAxis) {
        return 3.14* semiMajorAxis * semiMinorAxis;
    }
}