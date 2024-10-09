public class TestMyLine {

    public static void main(String[] args) {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(3, 4);

        MyLine myLine = new MyLine(begin, end);

        System.out.println("Length of the line: " + myLine.getLength());
        System.out.println("Gradient of the line: " + myLine.getGradient());


    }
}
    

