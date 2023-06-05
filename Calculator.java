import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two number:");
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//
//        System.out.println("Enter what you want to do :*,+,-,%,/");
//
//        char op = sc.next().charAt(0);
//        switch (op){
//            case '*' : System.out.println(A*B); break;
//            case '/' : System.out.println(A/B); break;
//            case '-' : System.out.println(A-B); break;
//            case '+' : System.out.println(A+B); break;
//            case '%' : System.out.println(A%B); break;
//
//        }

        //Problem 1: Grade Classification
        //Write a program that takes a student's score as input and prints their grade based on the following criteria:
        //
        //If the score is greater than or equal to 90, the grade is "A".
        //If the score is between 80 and 89, the grade is "B".
        //If the score is between 70 and 79, the grade is "C".
        //If the score is between 60 and 69, the grade is "D".
        //If the score is less than 60, the grade is "F".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        String grade;

        if (score >= 90) {
            grade = "A";

        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("The student's grade is: " + grade);



    }
}
