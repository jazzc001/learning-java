import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.size();
        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.size();
        list2.isEmpty();
        list2.contains(o);
        list2.toArray();
        /* ArrayList is usually faster.
        * ArrayList has direct references to every element.
        * LinkedList travels its length until it reaches element n.
        * Polymorphism: ArrayList and LinkedList can take the form of the interface they implement.
        It means that ArrayList and LinkedList implement List interface.

        * List interface: defines methods required from a class.
        For performance wise, LinkedList usually the wrong choice.

         */
    }
}
