import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] parts = {"tires", "keys"};

        Car nissan = new Car("Nissan", 2000, 2000, "blue", parts);
        nissan.setColor("Red");

        Car nissan2 = new Car(nissan);
        parts[1] = "rim"; // this will not change the nissan parts as new array is created and not pointing to the same array.

        String[] outsideVariables = nissan.getParts();
        outsideVariables[1] = "rim"; 

        nissan2.setParts(new String[] {"tires", "rim"});

        // System.out.println(nissan2.getMake());
        // System.out.println(nissan.getPrice());
        // System.out.println(nissan.getYear());
        // System.out.println(nissan.getColor());
        // System.out.println(Arrays.toString(nissan.getParts()));
        // System.out.println(Arrays.toString(nissan2.getParts()));

        // System.out.println(nissan);

        Car[] cars = new Car[] {
            new Car("Nissan", 2000, 2000, "blue", parts), 
            new Car("Nissan2", 2000, 2000, "red", parts),
        };

        
        Dealership dealership = new Dealership(cars);
        // for (int i = 0; i < cars.length; i++) {
        //     dealership.setCar(cars[i], i);
        // }
        // dealership.setCar(cars[0], 0);
        // dealership.setCar(cars[1], 1);

        // Car newCar = dealership.getCar(1);
        // System.out.println(newCar);

        // dealership.sell(1);
        // System.out.println(dealership.search("Nissan", 3000));

        System.out.println(dealership);
    }
}