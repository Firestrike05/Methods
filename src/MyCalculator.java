import java.util.Scanner;
public class MyCalculator {
    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");

        Scanner reader = new Scanner(System.in);
        double a = Double.parseDouble(reader.next());
        double b = Double.parseDouble(reader.next());

        welcome();
        multiply(a, b);
        subtract(a, b);
        divide(a, b);
        add(a,b);
        percent(a, b);
    }    public static void welcome() {
        System.out.println("Welcome to my calculator");
    }    public static void multiply(double a, double b){
        System.out.println(a + " * " + b + " = " + a * b);
    }    public static void divide(double a, double b){
        System.out.println(a + " / " + b + " = " + a / b);
    }    public static void add(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }    public static void percent(double a, double b){
        System.out.println(b + " % " + a + " = " + b / a * 100);
    }    public static void subtract(double a, double b){
        System.out.println(a + " - " + b + " = " + (a - b));
    }
}
