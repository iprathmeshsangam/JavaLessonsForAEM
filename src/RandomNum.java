import java.util.Random;

public class RandomNum {

    public static void main(String[] args){
        System.out.print("This is RandomNum generation - ");

        Random random = new Random();

        System.out.println(random.nextInt(1,50));
    }
}