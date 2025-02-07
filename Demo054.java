public class Demo054 {
    public static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public static void main(String[] args) {
        add(5, 10);
        add(4.5, 3.2);
        add(1, 2, 3);
    }
}
