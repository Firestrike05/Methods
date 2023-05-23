public class FibonacciCalc {
    public static void main(String[] args) {
        fibonacci();
    }    public static void fibonacci() {
        int n = 50;
        int fib1 = 0;
        int fib2 = 1;
        System.out.println(fib1);
        System.out.println(fib2);
        for(int i = 2; i < n; i++) {
            int fib = fib1 + fib2;
            System.out.println(fib);
            fib1 = fib2;
            fib2 = fib;
        }
    }
}



