

import java.util.Scanner;

class Que {

    public static int count = 0;
    int QueNumber;
    char correctAnswer;
    char givenAnswer;
    String result;

    Que(int QueNumber, char correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.QueNumber = QueNumber;
    }

    void answer(char givenAnswer) {
        this.givenAnswer = givenAnswer;
    }

    void showReport() {
        System.out.println(this.QueNumber + "\t\t" + this.correctAnswer + "\t\t" + this.givenAnswer + "\t\t" + this.result);
    }
}

public class OOP43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Que q1 = new Que(1,'C');
        Que q2 = new Que(2,'B');
        Que q3 = new Que(3,'B');
        Que q4 = new Que(4,'D');

        Que[] Ques = {q1,q2,q3,q4};


        for(int i = 0; i <= 3; i++) {
            System.out.print("Enter your answer for Que " + (i+1) + " : ");
            Ques[i].givenAnswer = sc.next().charAt(0);
        }

        for(Que Que : Ques) {

            if(Que.givenAnswer == Que.correctAnswer) {
                Que.result = "CORRECT";
                Que.count++;
            }
            else {
                Que.result = "WRONG";
            }
        }

        System.out.println("Que CORRECT GIVEN RESULT");

        for(Que Que : Ques) {
            Que.showReport();
        }

        System.out.println("\n\nTotal no. of correct answers : " + Que.count);
        System.out.println("Total no. of wrong answers : " + (4 - Que.count));
    }
}