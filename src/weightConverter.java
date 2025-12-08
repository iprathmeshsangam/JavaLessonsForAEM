import java.awt.color.CMMException;
import java.util.Scanner;

public class weightConverter {

    public  static void main(String[] args){
        //Weight converter program
        Scanner scanner = new Scanner(System.in);

        //Declare Variable
        double weight;
        double newWeight;
        int choice;

        //welcome message
        System.out.println("WELCOME TO WEIGHT CONVERTER!");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choice one option : ");
        choice = scanner.nextInt();
        //option 1 convert lbs to kgs
        if (choice ==1){
            System.out.print("Enter the weight in lbs : ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is : %.2f Kgs" ,newWeight);
        } else if (choice ==2) {
            System.out.print("Enter the weight in Kgs : ");
            weight = scanner.nextDouble();
            newWeight = weight / 2.20462;
            System.out.printf("The new weight in lbs is : %.2f lbs" ,newWeight);
        }else{
            System.out.println("You have entered incorrect option");
        }

       scanner.close();
    }
}
