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
        System.out.println("What is your name?");
        String name = userInput.nextLine();
        System.out.println("What is your age?");
        int age = userInput.nextInt();
        System.out.println("What is your GPA?");
        double GPA = userInput.nextDouble();
        if (age == 18){
            System.out.println("Hello "+ name + " You are eligible for the offer!!");
        }else {
            System.out.println("Hello "+ name + ", Thank your for participating but you are not eligible!! Better luck next time");
        }
        System.out.println("Your GPA is "+ GPA);

    }
}
