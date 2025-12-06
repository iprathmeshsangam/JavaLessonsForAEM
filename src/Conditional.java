import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
    // Conditional statement
        Scanner userInput = new Scanner(System.in);

        int age = 18;

        if (age >= 18){
            System.out.println("You are an adult");
        }else {
            System.out.println("You are child now");
        }

    }
}
