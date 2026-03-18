import java.util.Scanner;

class Question {

    public static int count = 0;
    public static int count2 = 0;
    int questionNumber;
    char correctAnswer;
    char givenAnswer;
    String result;

    Question(int questionNumber, char correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.questionNumber = questionNumber;
    }

    void answer(char givenAnswer) {
        this.givenAnswer = givenAnswer;
    }

    void showReport() {
        System.out.println(this.questionNumber + "\t\t" + this.correctAnswer + "\t\t" + this.givenAnswer + "\t\t" + this.result);
    }
}

public class OOP30 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Question q1 = new Question(1,'C');
        Question q2 = new Question(2,'A');
        Question q3 = new Question(3,'B');
        Question q4 = new Question(4,'D');
        Question q5 = new Question(1,'B');
        Question q6 = new Question(2,'C');
        Question q7 = new Question(3,'C');
        Question q8 = new Question(4,'A');

        Question[] questions = {q1,q2,q3,q4,q5,q6,q7,q8};


        for(int i = 0; i <= 7; i++) {
            System.out.print("Enter your answer for Question " + (i+1) + " : ");
            questions[i].givenAnswer = sc.next().charAt(0);
        }

        for(Question question : questions) {

            if(question.givenAnswer == question.correctAnswer) {
                question.result = "CORRECT";
                Question.count++;
            }
            else if(question.givenAnswer == 'X') {
                question.result = "UNANSWERED";
                Question.count2++;
            }
            else {
                question.result = "WRONG";
            }
        }

        System.out.println("\n\nQUESTION CORRECT GIVEN RESULT");

        for(Question question : questions) {
            question.showReport();
        }

        System.out.println("\n\nTotal no. of correct answers : " + Question.count);
        System.out.println("Total no. of wrong answers : " + (8 - Question.count2 - Question.count));
        System.out.println("Total no. of unanswered answers : " + Question.count2);
    }
}