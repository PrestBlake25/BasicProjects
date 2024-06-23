import java.util.Scanner;

public class MathQuizGame {
    public static void main(String[] args) {
        System.out.println("***** Math Quiz *****");
        System.out.println("To pass this quiz, you need to get at least 80% correctly\n");
        Scanner fetch = new Scanner(System.in);
        String correct = "Correct!\n";
        String incorrect = "Incorrect!\n";

        int scoreCount = 0;
        int totalQuestions = 5;

        System.out.println("Question 1\nWhat is 9 * 10?");
        int num = fetch.nextInt();
        fetch.nextLine(); // Consume the newline
        if (num == 90) {
            scoreCount++;
            System.out.println(correct);
        } else {
            System.out.println(incorrect);
        }

        System.out.println("Question 2\nApproximate PI to the hundredth place");
        double pi = fetch.nextDouble();
        fetch.nextLine(); // Consume the newline
        if (pi == 3.14) {
            scoreCount++;
            System.out.println(correct);
        } else {
            System.out.println(incorrect);
        }

        System.out.println("Question 3\nWhat does the E in acronym P.E.M.D.A.S stand for?");
        String answer = fetch.nextLine();
        if (answer.equalsIgnoreCase("exponent")) {
            scoreCount++;
            System.out.println(correct);
        } else {
            System.out.println(incorrect);
        }

        System.out.println("Question 4\nWhat is the name of the theorem: a^2 + b^2 = c^2");
        String answer2 = fetch.nextLine();
        if (answer2.equalsIgnoreCase("Pythagorean theorem")) {
            scoreCount++;
            System.out.println(correct);
        } else {
            System.out.println(incorrect);
        }

        System.out.println("Last Question\nWhich branch of math is about continuous change?");
        String answer3 = fetch.nextLine();
        if (answer3.equalsIgnoreCase("Calculus")) {
            scoreCount++;
            System.out.println(correct);
        } else {
            System.out.println(incorrect);
        }

        // Calculate the final score as a percentage
        double scorePercentage = ((double) scoreCount / totalQuestions) * 100;

        // Display the final result
        System.out.println("\nYou scored " + scoreCount + " out of " + totalQuestions + " (" + scorePercentage + "%).");
        if (scorePercentage >= 80) {
            System.out.println("Congratulations! You passed the quiz.");
        } else {
            System.out.println("Sorry, you did not pass the quiz. Better luck next time!");
        }

        fetch.close();
    }
}
