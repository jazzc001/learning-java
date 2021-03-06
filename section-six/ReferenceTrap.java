import java.util.Arrays;

public class ReferenceTrap {


    // changing staffThisYear will also change staffLastYear
    // public static void main(String[] args) {
    //     String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
    //     String[] staffThisYear = staffLastYear;
    //     staffThisYear[1] = "Ben";
    //     System.out.println(Arrays.toString(staffLastYear));
    //     System.out.println(Arrays.toString(staffThisYear));
    // }

    // Soultion one: make a new array
    // public static void main(String[] args) {
    //     String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
    //     String[] staffThisYear = new String[staffLastYear.length];
    //     for (int i = 0; i < staffThisYear.length; i++) {
    //         staffThisYear[i] = staffLastYear[i];
    //     }
    //     staffThisYear[1] = "Ben";
    //     System.out.println(Arrays.toString(staffLastYear));
    //     System.out.println(Arrays.toString(staffThisYear));
    // }

    // Soultion two: use copy
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Ben";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

    }
}