import java.util.Scanner;

public class Exam {

    Question[] questions = {
        new Question("Java is a ____ ?", "Language", "OS", "Browser", "Device", 1),
        new Question("Which keyword is used to inherit a class?", "this", "super", "extends", "implements", 3),
        new Question("Which method starts execution?", "start()", "main()", "run()", "init()", 2)
    };

    public void startExam() {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("\nExam started! You have 30 seconds.\n");
        
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 30000; 

        for (int i = 0; i < questions.length; i++){
            if (System.currentTimeMillis() > endTime) {
                System.out.println("\nTime up! Auto submitting exam...");
                break;
            }
            Question q = questions[i];
            System.out.println(q.question);
            System.out.println("1. " + q.option1);
            System.out.println("2. " + q.option2);
            System.out.println("3. " + q.option3);
            System.out.println("4. " + q.option4);
            System.out.print("Your answer: ");

            int ans = sc.nextInt();

            if (ans == q.correctAnswer) {
                score++;
            }
        }

        System.out.println("\nExam Finished!");
        System.out.println("Your Score: " + score + "/" + questions.length);
    }
}
