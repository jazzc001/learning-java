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

    // Soultion one
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = staffLastYear;
        staffThisYear[1] = "Ben";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}