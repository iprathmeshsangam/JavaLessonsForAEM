public class OverloadedMethods {

    public static void main(String[] args){

    //Over loaded methods = method that shares same name but have a different parameters
        // method name + parameters = method signature

    double x = add(0.2,2.0);
        System.out.println(x);
    }

    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    static int add (int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static int sum (int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }

    // using double as over loaded method
    static double add(double a, double b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }
}
