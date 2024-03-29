import java.util.Arrays;

import models.Discountable;
import models.Pants;
import models.Shirt;
import models.Product;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    // public static void main(String[] args) {

    
        
    //     Product[] products = new Product[] {
    //         new Shirt(Shirt.Size.MEDIUM, 5.99, "blue", "java"),
    //         new Pants(32, 24, "blue", "Java")
    //     }; // a class can take its own form, or it can take the from that they inderit from
    

    //     Shirt shirt = new Shirt(Shirt.Size.SMALL, 5.99, "blue", "java");
    //     Pants pants = new Pants(32, 24, "blue", "Java");
    //     Shirt shirt2 = new Shirt(shirt);
    //     Pants pants2 = new Pants(pants);
    //     Pants pants3 = new Pants(34, 9.99, "red", "Janger");

    //     System.out.println(pants3.compareTo(pants2));


    //     // shirt.getColor();
    //     // shirt.setColor("red");
        
        
    //     // shirt.equals(shirt2);
    //     // System.out.println(shirt.hashCode());
    //     // System.out.println(shirt2.hashCode());

    //     // System.out.println(shirt);
    //     // System.out.println(pants);

    //     // shirt.fold();
    //     // pants.fold();

    //     pants2.dsicount();

    //     /* When two classes share common fields:
    //      * Never define the same fields in each class,
    //      * Each class should inderit common fields from a Parent class
    //      * child classes inderit from a Parent class.
    //      */

    //      /* Polymorphism
    //       * Inheritance allows an object to take many forms
    //       * it allows an object to be polymorphic
    //       */

    //     /* Objects that are equal must share the same hashCode
    //      * When you override equals(), you mush override hashCode()
    //      */
    // }

    public static void main(String[] args) {

        Product[] products = new Product[] {
            new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
            new Shirt(Shirt.Size.MEDIUM, 22.99, "Black", "CHANEL"),
            new Pants(34, 104.99, "Red", "JANGLER"),
            new Shirt(Shirt.Size.SMALL, 13.99, "Orange", "GEORGE"),
            new Pants(30, 119.99, "Grey", "FENDI"),
            new Shirt(Shirt.Size.LARGE, 34.99, "Blue", "ECKO"),
            new Pants(30, 129.99, "Red", "VERSACE"),
            new Shirt(Shirt.Size.SMALL, 22.99, "Beige", "ZARA"),
            new Pants(29, 99.99, "Dark", "JANGLER"),
            new Shirt(Shirt.Size.SMALL, 19.99, "Red", "NIKE"),
            new Pants(26, 24.99, "Indigo", "BELSTAFF"),
            new Shirt(Shirt.Size.LARGE, 29.99, "Blue", "ADIDAS"),
            new Pants(34, 104.99, "Red", "JANGLER"),
        };

        Arrays.sort(products);
        printArray(products);
       
    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);   
        }
    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
}
