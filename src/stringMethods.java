public class stringMethods {

    public static void main (String[] args){
        String name = "                    Prathmesh           ";

        //Length of a string
        int length = name.length();
        //Character At
        char letter = name.charAt(0);
        //Find index of a letter
        int index = name.indexOf("s");
        //To upper case
        name = name.toUpperCase();
        name = name.toLowerCase().trim();
        name = name.replace("m","o");

        String test = "Bro code";

        System.out.println(test.isEmpty());
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(name);

        if (test.contains(" ")){
            System.out.println("Your name contains space");
        }else {
            System.out.println("Hello " + test);
        }

    }
}
