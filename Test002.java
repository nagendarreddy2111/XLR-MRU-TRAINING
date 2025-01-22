import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String reply;
     while(true){
        System.out.print("Enter message: ");
         reply = sc.nextLine();
        if(reply.equals("yes")){
            System.out.print("Happy Sankranthi");
            break; 
        }
        else{
            System.out.println("No");
            

        }
      
     } 
     sc.close();
}
}