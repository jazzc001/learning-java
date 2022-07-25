package models;

import java.util.Objects;

public class Pants extends Product{
    private int waist;
    
    public Pants(int waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
       
    }

    public Pants(Pants source) {
        super(source);
        this.waist = source.waist;
       
    }


    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    @Override
    public void fold() {
        // TODO Auto-generated method stub
        System.out.println("Hold pants upright");
        System.out.println("fold on leg over the other");
        System.out.println("Fold pants from bottom in thirds");
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pants)) {
            return false;
        }
        Pants pants = (Pants) o;
        return waist == pants.waist
            && super.getPrice() == pants.getPrice()
            && super.getColor().equals(pants.getColor())
            && super.getBrand().equals(pants.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(waist, super.getPrice(), super.getBrand(), super.getColor());
    }


    @Override
    public String toString() {
        return "{" +
            " waist='" + getWaist() + "'" +
            " price='" + super.getPrice() + "'" +
            " color='" + super.getColor() + "'" +
            " Brand='" + super.getBrand() + "'" +
            "}";
    }






}
