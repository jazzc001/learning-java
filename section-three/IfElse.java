import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your grade?");
        int grade = scan.nextInt();

        if (grade > 50) {
            System.out.println("Great job, you passed!");
        } else {
            System.out.println("Study hard next time!");
        }
    }
}