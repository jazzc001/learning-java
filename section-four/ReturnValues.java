public class ReturnValues {
    public static void main(String[] args) {
        double area = measureRectangle(2.2, 4.3);
        System.out.println(" The area of the rectangle is " + area + " cm.");

    }

    public static double measureRectangle( double length, double width) {
        double area = length * width;
        return area;
        

    }
}