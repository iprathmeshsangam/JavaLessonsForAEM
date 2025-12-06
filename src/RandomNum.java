import java.util.Random;

public class RandomNum {

    public static void main(String[] args){
//        System.out.print("This is RandomNum generation - ");

       Random random = new Random();

      boolean isHead;

      isHead = random.nextBoolean();

      if (isHead){
          System.out.println("Heads");
      }else {
          System.out.println("Tails");
      }
    }
}