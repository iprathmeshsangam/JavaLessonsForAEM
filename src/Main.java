public  class Main {
   public static void main (String[] args){

       // This is my first JAVA program
       System.out.println("This is a line of code and we are learning JAVA variables");

       // Variables

       // int

       int age = 29;
       //Double
       double price = 199.99;

       //Char
       char grade = 'A';
       char symbol = '₹';

       //Boolean
       boolean isStudent = true;
       boolean forSale = false;
       boolean isOnline = true;
       System.out.println("Your age is " + age + " therefore you have to pay "+  + symbol + price);

       if (isStudent){
           System.out.println("You are a student");
       }else {
           System.out.println("You are not a student");
       }

   }
}