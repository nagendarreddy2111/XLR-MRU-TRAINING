import java.util.Scanner;
public class Demo035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("The biggest number is: "+num1);
        }else if(num2>num1){
            System.out.println("The biggest number is: "+num2);
        }else{
            System.out.println("Both are equal");
        }
    }
    
}