import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which language is used for Android Development?",
            "2. Which keyword is used to inherit a class in Java?",
            "3. Which company developed Java?"
        };

        String[][] options = {
            {"A. Python", "B. Java", "C. C++", "D. Swift"},
            {"A. this", "B. import", "C. extends", "D. final"},
            {"A. Microsoft", "B. Google", "C. Sun Microsystems", "D. Apple"}
        };

        char[] answers = {'B', 'C', 'C'};

        int score = 0;

        System.out.println("===== Java Quiz Application =====\n");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer: ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                score++;
            }

            System.out.println();
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}