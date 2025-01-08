public class Demo14Unary {
    public static void main(String[] args) {
        int number = 5;
        boolean flag = true;

        // Unary plus
        System.out.println("Unary plus: " + (+number));

        // Unary minus
        System.out.println("Unary minus: " + (-number));

        // Pre-increment
        System.out.println("Pre-increment: " + (++number)); // number is now 6

        // Post-increment
        System.out.println("Post-increment: " + (number++)); // prints 6, then number becomes 7

        // Pre-decrement
        System.out.println("Pre-decrement: " + (--number)); // number is now 6 again

        // Post-decrement
        System.out.println("Post-decrement: " + (number--)); // prints 6, then number becomes 5

        // Logical NOT
        System.out.println("Logical NOT: " + (!flag)); // flag is true, so !flag is false
    }
}
