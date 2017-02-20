package course.Daniel.Java;

/**
 * Created by Jakars on 10/02/2017.
 */
public class Trivia {

    String question;
    String [] answers;
    String correctAns;

    public Trivia() {
        this.question = IO.getString("Enter the question");
        this.answers = IO.getStringArray("Enter the answers", 4);
        this.correctAns = IO.getString("Enter the correct answer:");

    }

    public Trivia(String question, String[] answers, String correctAns) {
        this.question = question;
        this.answers = answers;
        this.correctAns = correctAns;
    }

    boolean isCorrect (){
        int request = IO.getInt("Enter answer number:", 1, 4);
        String answerAsString = answers [request];
        boolean correct;
        if (answerAsString.equals(correctAns)){
            System.out.println("Your answer is Correct :)");
            correct = true;
        }
        else {
            System.out.println("You have entered a wrong answer, the correct answer is:" + correctAns);
            correct = false;
        }
        return correct;

    }

    void showQuestion (){
        if (!question.endsWith("?")){
            System.out.println(question + "?");
        }
        else {

            System.out.println(question);
        }

    }

    void showAnswers (){
  //      Collections.shuffle(answers);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(i+1 + ") " + answers[i]);
        }
    }



}
