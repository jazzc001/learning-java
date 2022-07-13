import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = new int[3][4];
        grades[0][1] = 20;
        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

    }
}