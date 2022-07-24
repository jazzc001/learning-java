import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Person {
  
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person source) {
        this.name = source.name;
        this.age = source.age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // public int getAge() {
    //     return age;
    // }

    // public String getName() {
    //     return name;
    // }

    // // @Override
    // // public boolean equals(Object obj) {
    // //     if (obj == null) {
    // //         return false;
    // //     }
    // //     if (!(obj instanceof Person)) {
    // //         return false;
    // //     }

    // //     Person person = (Person)obj;
    // //     return this.age == person.getAge() && this.name.equals(person.getName());
    // // }

    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return "age: " + this.age + ", name: " + this.name;
    // }

}
