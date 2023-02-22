import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        try (Scanner input = new Scanner(System.in)) {
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
            System.out.println("Press 0 to exit the chatbot");
            System.out.println("Press 1 to look up your car");
            System.out.println("Press 2 to renew your car");
            System.out.println("Press 3 to sign up for license test");
            System.out.println("Press 4 to pay for fees");
            System.out.println("Press 5 to change the address on your driver's license");
            System.out.println("Press 6 for information on how to obtain a driver's license");
            System.out.println("Press 7 for information on how to obtain a motorcyle license");
            System.out.println("Press 8 for information on obtaining a commerical driver's license ");
            System.out.println("Press 9 to report a lost or stolen driver's license");

            // Allowing the user to make a decision
            System.out.print("Please make a decision: ");
            int user_decision = input.nextInt();

            // Creating an object 
            Options options = new Options();

            // Calling an options method based on user input 
            switch(user_decision){
                case 1:
                    System.out.print("What is the make of your car? ");
                    String make = input.nextLine();
                    System.out.print("What is the model of your car? ");
                    String model = input.nextLine();
                    int year = input.nextInt();
                    options.look_up_car(make, model, year);
                    break;
                case 2: 
                    System.out.print("Do you want to renew your vehicle? ");
                    boolean questionRenew = input.nextBoolean();
                    System.out.print("Have you gotten your vehicle approved for the year? ");
                    boolean approvedVehicle = input.nextBoolean();
                    if(approvedVehicle && questionRenew == true)
                    {
                        options.renew_vehicle(true);
                    }
                    else{
                        options.renew_vehicle(false);
                    }
                    break;
                case 3:
                    System.out.print("Enter your age: ");
                    int age = input.nextInt();
                    System.out.print("Do you have a permit? ");
                    boolean permit = input.nextBoolean();
                    options.sign_up(age, permit);
                    break;
                case 4: 
                    System.out.print("Can you pay the $50 fee for our service: ");
                    boolean canPay = input.nextBoolean();
                    options.pay(canPay);
                    break;
                case 5: 
                    System.out.print("Add your previous address: ");
                    String oldAddress = input.nextLine();
                    System.out.print("Add your new address: ");
                    String newAddress = input.nextLine();
                    options.change_address(oldAddress, newAddress);
                    break;
                case 6: 
                    options.get_drivers_license();
                    break;
                case 7: 
                    options.get_motorcycle_license();
                    break;
                case 8: 
                    options.get_commercial_license();
                    break;
                case 9: 
                    int reportAge = input.nextInt();
                    String reportName = input.nextLine();
                    options.report_license(reportName, reportAge);
                    break;

                default: 
                    System.out.println("The option that you selected does not exist. Please try again");

            }
        }
    }
}
