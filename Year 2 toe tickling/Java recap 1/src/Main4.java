/*
Uh, the Common marking scheme hyperlink leads to a 404, soon imma just, make up my own
scores will be between 0 and 100

0-39 = fail (submission fails to prove the student sufficiently knows and can sustain their given topic or subject)
40-59 = pass (submission achieves a satisfactory level of understaing being sustained but has major gaps or oversights)
60-79 = merit (submission greatly achieves to show the students knowledge and their ability to sustain and portray it, only minor errors)
80-100 = distinction (submission achieves an extreme academic standard and shows the student is extremely confident and versed in the given topic, errors are virtually inexistent or extremely minor)

loosely based on the grade possible out of a BTEC level 3 in England, I say loosely as i don't remember the grades being like this, like numbers wise
but given the mistake in the exercise, I believe I am allowed such a liberty, good thing I have been yapping on mine website over summer

oh code has also been reused yes


@Author David/Rofleemo
@Version 1.0 (no updates needed, cuz it's perfect)

 */

import java.util.Scanner;
import java.util.InputMismatchException;

class Main4 {
    public static void main(String[] args) {

        //Scans for user input
        Scanner sc = new Scanner(System.in);

        //where number is called, stored actually
        double score;


        //Here we use a try catch loop to give the code some decent input validation as the task specifies floating point data type
        while (true) {
            try {
                System.out.print("Enter student score: ");
                score = sc.nextDouble();

                if (score < 0 || score > 100) { //enforces a score limit, as cool as it may be, i don't think anyone can truly get over 100, or worse under 0
                    System.out.println("Score must be between 0 and 100.");
                    continue; //goes back and asks again
                }
                break; //this ensures only a valid NUMBER BETWEEN 0 AND 100 leaves the loop

            } catch (
                    InputMismatchException e) { //here a number only enforcement is in place, avoid any A or accidental - or whatever teh fuck else
                System.out.println("Error: not a number, try again.");
                sc.next();
            }
        }


        //This is where the score is harshly graded and spit out to the unsuspecting student
        if (score < 40) {
            System.out.println("Fail - submission fails to prove the student sufficiently knows and can sustain their given topic or subject");
        } else if (score < 60) {
            System.out.println("Pass - submission achieves a satisfactory level of understaing being sustained but has major gaps or oversights");
        } else if (score < 80) {
            System.out.println("Merit - submission greatly achieves to show the students knowledge and their ability to sustain and portray it, only minor errors");
        } else {
            System.out.println("Distinction - submission achieves a extreme academic standard and shows the student is extremely confident and versed in the given topic, errors are virtually inexistent or extremely minor");
        }

        sc.close();

    }
}
