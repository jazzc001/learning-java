public class Main {

    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2000, 2000, "blue");
        nissan.setColor("Red");

        Car nissan2 = new Car(nissan);

        System.out.println(nissan2.getMake());
        System.out.println(nissan.getPrice());
        System.out.println(nissan.getYear());
        System.out.println(nissan.getColor());
    }
}