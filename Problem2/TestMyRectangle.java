package Problem2;

public class TestMyRectangle {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(1, 4);
        MyPoint point2 = new MyPoint(5, 1);

        MyRectangle rectangle = new MyRectangle(point1, point2);

        System.out.println("Rectangle 1 (With MyPoint): ");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        MyRectangle rect2 = new MyRectangle(1,4,5,1);

        System.out.println("\nRectangle 2 (With integers): ");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
