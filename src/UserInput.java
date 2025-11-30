import javax.xml.transform.Source;
import java.util.Scanner;
public class UserInput {
    public static void  main(String[] args){
        // User Input in JAVA
        //Scanner is an object that helps us take user input in JAVA
        //To use Scanner we need to import JAVA utils
        /*

        import java.utils.Scanner
            Util is a package
            Scanner is a Class

         .nextLine() /// For String
         .nextInt() /// For integer
         .nextDouble() /// For Double Data type
         */
        Scanner userInput = new Scanner(System.in);
        System.out.print("What is your name?");
        //String
        String name = userInput.nextLine();
        System.out.print("What is your age?");
        //Int
        int age = userInput.nextInt();
        System.out.print("What is your GPA?");
        //Double
        double GPA = userInput.nextDouble();
        //Boolean
        System.out.print("Are you a Student? (true/false)");
        boolean isStudent = userInput.nextBoolean();
        if (age == 18){
            System.out.println("Hello "+ name + " You are eligible for the offer!!");
        }else {
            System.out.println("Hello "+ name + ", Thank your for participating but you are not eligible!! Better luck next time");
        }
        System.out.println("Your GPA is "+ GPA);
        if (isStudent){
            System.out.println("You are a student");
        }

        userInput.close();
    }
}
