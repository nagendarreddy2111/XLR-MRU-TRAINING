import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int lastDigit = num % 10;
        int firstDigit = num;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        System.out.println("Sum of first and last digits: " + (firstDigit + lastDigit));
    }
}
