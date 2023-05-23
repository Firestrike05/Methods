import java.util.Scanner;
public class MinMaxMethods {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        double num4;
        double num5;
        double num6;

        System.out.println("Enter 3 numbers");
        Scanner reader = new Scanner(System.in);

        if (reader.hasNextDouble()) {
            num4 = Double.parseDouble(reader.next());
            num5 = Double.parseDouble(reader.next());
            num6 = Double.parseDouble(reader.next());

            double maxNum = max(num4, num5, num6);
            double minNum = min(num4, num5, num6);

            System.out.println("The biggest number is: " + maxNum);
            System.out.println("The smallest number is: " + minNum);
        }
        if (reader.hasNextInt()) {
            num1 = Integer.parseInt(reader.next());
            num2 = Integer.parseInt(reader.next());
            num3 = Integer.parseInt(reader.next());

            int maxNum = max(num1, num2, num3);
            int minNum = min(num1, num2, num3);

            System.out.println("The biggest number is: " + maxNum);
            System.out.println("The smallest number is: " + minNum);

        }
    }
    public static int max(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else return num3;
    }
    public static double max(double num1, double num2, double num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else return num3;
    }
    public static int min(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else return num3;
    }
    public static double min(double num1, double num2, double num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else return num3;
    }
}
