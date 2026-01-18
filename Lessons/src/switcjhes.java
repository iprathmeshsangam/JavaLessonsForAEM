import javax.xml.transform.Source;
import java.util.Scanner;

public class switcjhes {

    public static void main(String[] args){
        //Enhanced Switch = A replacement to many else statements: (Java 14 feature)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day : ");

        String day = scanner.nextLine();


        switch (day){
            case "Monday" -> System.out.println("It is a Weekday 😑");
            case "Tuesday" -> System.out.println("It is a Weekday 😑");
            case "Wednesday" -> System.out.println("It is a Weekday 😑");
            case "Thrusday" -> System.out.println("It is a Weekday 😑");
            case "Friday" -> System.out.println("It is a Weekday 😑");
            case "Saturday" -> System.out.println("It is a Weekend 😎");
            case "Sunday" -> System.out.println("It is a Weekend 😎");
            default -> System.out.println("Please enter a valid day!!");
        }
    }
}
