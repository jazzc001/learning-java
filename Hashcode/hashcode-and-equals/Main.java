import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2016);
        System.out.println("Nissan: " + nissan.hashCode());

        Car toyota = new Car("Toyota", 2016);
        System.out.println("Toyota: " + toyota.hashCode());

        Car nio = new Car("Nio", 2016);
        System.out.println("Nio: " + nio.hashCode());

        Car nissan2 = new Car(nissan);
        System.out.println("Nissan: " + nissan.hashCode());

        /* 
         * equal objects must have the same hashCode
         * Otherwise, you will get bugs with hash-based collections
         */

        HashMap<Car, Double> prices = new HashMap<Car, Double>();
        prices.put(nissan, 10000.);
        prices.put(toyota, 20000.);
        prices.put(nio, 30000.);

        nissan2.equals(nissan);
        System.out.println(prices.get(nissan2));




    }
}
