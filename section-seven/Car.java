import java.util.Arrays;

public class Car {

    /* Fields */
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
    
    /* Constructors */
    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    
    /* how to let a new car object just copying from one another */ 
    public Car(Car source) {
        /* copies values from source object into current object */
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    /* Getters */

    public String getMake() {
        return this.make;
    }
    public double getPrice() {
        return this.price;
    }
    public int getYear() {
        return this.year;
    }
    public String getColor() {
        return this.color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }


    /* Setters  */
    public void setMake(String make) {
       this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    


    /* Actions */
    public void drive() {
        System.out.println("This " + this.make + " is driving.");
    }

}