public class Main {

    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2000, 2000, "blue");
        nissan.setColor("Red");
        System.out.println(nissan.getMake());
        System.out.println(nissan.getPrice());
        System.out.println(nissan.getYear());
        System.out.println(nissan.getColor());
    }
}