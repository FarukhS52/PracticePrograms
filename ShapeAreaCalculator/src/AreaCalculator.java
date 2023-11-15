import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {

        double area;
        ShapesArea shapesArea = new ShapesArea();
        Scanner scanner = new Scanner(System.in);

        System.out.println("select the shape to calculate Area");

        System.out.println(" Press 1 for Circle");
        System.out.println(" Press 2 for Square");
        System.out.println(" Press 3 for Rectangle");
        System.out.println(" Press 4 for Triangle");
        System.out.println(" Press 5 for Parallelogram");
        System.out.println(" Press 6 for Trapezoid");
        System.out.println(" Press 7 for Ellipse");

        int userInput = scanner.nextInt();

        if(userInput==1){
            System.out.println("Enter the radius of Circle");

            int radius = scanner.nextInt();
            area = shapesArea.getAreaOfCircle(radius);
            System.out.println("Area of Circle is : " + area);

        } else if (userInput==2){
            System.out.println("Enter the length of the Side of Square");

            int side = scanner.nextInt();
            area = shapesArea.getAreaOfSquare(side);
            System.out.println("Area of Square is : " + area);

        } else if (userInput==3) {
            System.out.println("Enter the Width of Rectangle");
            int width = scanner.nextInt();

            System.out.println("Enter the Length of Rectangle");
            int length = scanner.nextInt();

            area = shapesArea.getAreaOfRectangle(width,length);
            System.out.println("Area of Rectangle is : " + area);

        } else if (userInput==4) {
            System.out.println("Enter the Base of Triangle");
            int base = scanner.nextInt();

            System.out.println("Enter the Height of Triangle");
            int height = scanner.nextInt();

            area = shapesArea.getAreaOfTriangle(base,height);
            System.out.println("Area of Triangle is : " + area);

        } else if (userInput==5) {
            System.out.println("Enter the Base of Parallelogram");
            int base = scanner.nextInt();

            System.out.println("Enter the Height of Parallelogram");
            int height = scanner.nextInt();

            area = shapesArea.getAreaOfParallelogram(base,height);
            System.out.println("Area of Parallelogram is : " + area);

        } else if (userInput==6) {
            System.out.println("Enter the Base 1 of Trapezoid");
            int base1 = scanner.nextInt();

            System.out.println("Enter the Base 2 of Trapezoid");
            int base2 = scanner.nextInt();

            System.out.println("Enter the Height of Trapezoid");
            int height = scanner.nextInt();

            area = shapesArea.getAreaOfTrapezoid(base1,base2,height);
            System.out.println("Area of Trapezoid is : " + area);

        } else if (userInput==7) {
            System.out.println("Enter the Length of Semi-minor-axis of Ellipse");
            int semiMinorAxis = scanner.nextInt();

            System.out.println("Enter the Length of Semi-major-axis of Ellipse");
            int semiMajorAxis = scanner.nextInt();

            area = shapesArea.getAreaOfEllipse(semiMinorAxis,semiMajorAxis);
            System.out.println("Area of Ellipse is : " + area);

        }
    }
}
