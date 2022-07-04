import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;

        System.out.println("Welcom. Thank you for talking the survey");
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow manay times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions!");
        System.out.println("\nYour fastfood expenses are $" + (foodAmount*foodPrice) +" per week.");
        System.out.println("\nYour coffee expenses are $" + (coffeeAmount*coffeePrice) +" per week.");
       scan.close();



    }
}