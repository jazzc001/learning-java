import models.Pants;
import models.Shirt;
import models.Product;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

    
        
        Product[] products = new Product[] {
            new Shirt("Amall", 5.99, "blue", "java"),
            new Pants(32, 24, "blue", "Java")
        }; // a class can take its own form, or it can take the from that they inderit from
    

        Shirt shirt = new Shirt("Amall", 5.99, "blue", "java");
        Pants pants = new Pants(32, 24, "blue", "Java");
        Shirt shirt2 = new Shirt(shirt);

        shirt.getColor();
        shirt.setColor("red");

        /* When two classes share common fields:
         * Never define the same fields in each class,
         * Each class should inderit common fields from a Parent class
         * child classes inderit from a Parent class.
         */

         /* Polymorphism
          * Inheritance allows an object to take many forms
          * it allows an object to be polymorphic
          */
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
