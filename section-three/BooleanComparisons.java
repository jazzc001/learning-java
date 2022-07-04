public class BooleanComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 65;
        double mathGrade = 70.55;



        System.out.println(biologyGrade > chemistryGrade);
        System.out.println(mathGrade > biologyGrade);

        String sentence = "I love this course";
        String sentence2 = "I love this course";
        System.out.println(!sentence.equals(sentence2));
        System.out.println(sentence == sentence2);

    }
}