import models.Pants;
import models.Shirt;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        Shirt shirt = new Shirt("Amall", 5.99, "blue", "java");
        Pants pants = new Pants(32, 24, "blue", "Java");

        /* When two classes share common fields:
         * Never define the same fields in each class,
         * Each class should inderit common fields from a Parent class
         * child classes inderit from a Parent class.
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
