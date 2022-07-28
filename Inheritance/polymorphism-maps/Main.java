import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    /*
     * Map: HashMap, TreeMap, LinkedHashMap
     * HashMap directly implements the Map interface
     * LinkedHashMap is a child class of HashMap which indirectly implements Map interface.
     * TreeMap implements the sort map which indirectly implements Map.
     * Map is an interface: defines methods requred from a class.
     * HashMap has no order
     *  LinkedHashMap and TreeMap follow order. Treemap will sorted the value from lowest to highest price.
     * 
     * When to use HashMap?
     * For performance, use HashMap when order isn't important.
     * 
     * When to use TreeMap?
     * To sort entries according to what you specify
     * 
     * When to use LinkedHashMap?
     * To sort entries according to insertion order.
     */

    public static void main(String[] args) {
        TreeMap<Book, String> books = new TreeMap<Book, String>();
        books.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        books.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        books.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        books.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");
    }  

    public static void printMap(Map<Book, String> map) {
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        });
    }
}
