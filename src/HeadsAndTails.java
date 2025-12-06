import java.util.Random;

public class HeadsAndTails {

    public static void main(String[] args){

        // Heads or tails
        Random random = new Random();

        Boolean isHead;

        isHead = random.nextBoolean();

        if(isHead){
            System.out.println("Heads");
        }else {
            System.out.println("Tails");
        }
    }
}
