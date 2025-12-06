import java.util.Scanner;

public class CompoundCal {
    public static void main(String[] args){
        System.out.println("Compound Interest Calculator");

        Scanner scanner = new Scanner(System.in);
        double principal;
        double interest;
        int timeOfComp;
        int years;
        double amount;

        System.out.print("Enter the principal Amount : ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest : ");
        interest = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year : ");
        timeOfComp = scanner.nextInt();

        System.out.print("Enter the numbers of years : ");
        years = scanner.nextInt();

        amount = principal * Math.pow( 1 + interest * timeOfComp , timeOfComp * years);

        System.out.printf("The Amount after %d years is $%.2f",years , amount);

        scanner.close();
    }
}
