import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        //Shopping cart program

        Scanner userInput = new Scanner(System.in);

        System.out.print("What would you like to buy? ");
        String item = userInput.nextLine();
        System.out.print("What is the price of each? ");
        double price = userInput.nextDouble();
        System.out.print("How much do you wanna purchase? ");
        int quantity = userInput.nextInt();
        //char currency = '$';
        double total;

        total = quantity * price;
        System.out.println("You have purchased " + quantity + " " + item + " for " + price + " INR  each "+ " , your total is " + total + " INR");

        userInput.close();
    }

}
