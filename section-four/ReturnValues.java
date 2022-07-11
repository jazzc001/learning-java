public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(-2.2, 4.3, "area");
        System.out.println(" The area of the rectangle is " + measure1 + " cm.");

        double measure2 = measureRectangle(2.2, 4.3, "perimeter");
        System.out.println(" The perimeter of the rectangle is " + measure2 + " cm.");

    }

    public static double measureRectangle( double length, double width, String option) {
        if (length < 0 || width < 0) {
            System.out.println("length or width must be positive");
            System.exit(0);
        }
        switch (option) {
            case "area": return length * width;
            case "perimeter": return 2 * (length * width);
            default: return 404;
        }
        
    
    }
}