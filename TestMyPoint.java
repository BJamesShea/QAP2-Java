public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(0,0);
        MyPoint myPoint2 = new MyPoint(3,4);
        System.out.println(myPoint1);
        System.out.println(myPoint2);

        double distance = myPoint1.distance(myPoint2);
        System.out.println("Distance between (0,0) and (3,4): " + distance);


    }

}
