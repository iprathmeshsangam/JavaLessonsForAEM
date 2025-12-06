public class fprint {
    public static void main(String[] args){

        //printF is a method used to format output
        //%[flags][width][.percision][specifier-chracter]
        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = false;

        //We will use printf instead of print or println
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n",firstLetter);
        //we use d for int
        System.out.printf("You are %d years old \n",age);
        //we use f for double
        System.out.printf("You are %f inches tall\n",height);
        //Employed
        System.out.printf("Employed : %b\n",isEmployed);
    }
}
