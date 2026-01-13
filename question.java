public class question {
    String question;
    String option1, option2, option3, option4;
    int correctAnswer;

    public question(String question, String o1, String o2, String o3, String o4, int correctAnswer) {
        this.question = question;
        option1 = o1;
        option2 = o2;
        option3 = o3;
        option4 = o4;
        this.correctAnswer = correctAnswer;
    }
}


