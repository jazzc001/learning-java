public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jasmine", 30);
        // Person person2 = person;
        Person person2 = new Person(person);

        // System.out.println(person2 == person); // never use double == signs to compare objects
        System.out.println(person2.equals(person));

    } 
}
