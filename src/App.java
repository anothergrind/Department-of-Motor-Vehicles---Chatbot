import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        // Brief greeting 
        System.out.println("Welcome to the Department of Motor Vehicles Virtual Assistant also known as DMVA");
        
        //Starter question
        System.out.println("How can I assist you today?");
        
        // List that stores the user's options 
        ArrayList<Integer> user_options = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++)
        {
            user_options.add(i);
        }

        // List of options that the user has
        System.out.println("Press 1 to look up your car");
        System.out.println("Press 2 to renew your car");
        System.out.println("Press 3 to sign up for license test");
        System.out.println("Press 4 to pay for fees");
        System.out.println("Press 5 to change the address on your driver's license");
        System.out.println("Press 6 for information on how to obtain a driver's license");
        System.out.println("Press 7 for information on how to obtain a motorcyle license");
        System.out.println("Press 8 for information on obtaining a commerical driver's license ");
        System.out.println("Press 9 to report a lost or stolen driver's license");
        System.out.println("Press 10 for general information and FAQs");

        // Allowing the user to make a decision
        System.out.print("Please make a decision: ");
        int user_decision = input.nextInt();
    }
}
