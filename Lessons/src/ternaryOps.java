import java.util.Scanner;

public class ternaryOps {
    public static void main (String[] args){
        //ternary Opertors  ? = Return 1 of 2 values if a condition is true.

        //Variable = (Condition)  ? ifTrue : ifFalse ;

        //It is an Alternative to if or Else statement
//        int Score = 55;
//
//        String passOrFail = (Score >= 55) ? "PASS" : "FAIl";
//        System.out.println(passOrFail);

        //Write a function with ternary operator to check if the number is even or odd ?

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int userInput = scanner.nextInt();

        String evenOrodd = (userInput % 2 == 0) ? "Even" : "odd";
        System.out.println(evenOrodd);

    }
}
