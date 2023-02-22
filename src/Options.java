/*
 * This class is supposed to hold all of the potential options a user has
 * in the chatbot
 */
public class Options {
    public String look_up_car(String make, String model, int year){
        return "Your car " + make + " " + model + " " + year + " is registered in the DMV";
    }

    public String renew_vehicle(boolean renew){
        if(renew == true){
            return "Your vehicle is renewed"; 
        }
        else
        {
            return "We couldn't find your vehicle";
        }
    }

    public String sign_up(int age, boolean permit){
        if(age >= 16 && permit == true)
        {
            return "You are eligible to sign up";
        }
        else{
            return "You aren't eligible to sign up";
        }
    }

    public String pay(boolean canPay){
        if(canPay == true)
        {
            return "Transaction complete";
        }
        return "Not enough money in your account";
    }

    public String change_address(String oldAddress, String newAddress){
        return "Your addresss has been updated from " + oldAddress + " to " + newAddress;
    }

    public void get_drivers_license(){
        System.out.println("There are six steps that need to be taken in order to get a driver's license");
        System.out.println("1. Meet the age requirement: The age requirement for obtaining a driver's license varies by state, but in most states, it is 16 years old.");
        System.out.println("2. Take a driver's education course: Many states require driver's education before you can take the driving test");
        System.out.println("3. Practice driving: Practice driving with a licensed adult in the car with you. In some states, you may need to log a certain number of hours of practice driving before taking the driving test.");
        System.out.println("4. Pass the written test: Study the driver's handbook and take a written test to obtain a learner's permit.");
        System.out.println("5. Pass the driving test: Once you have logged enough practice hours and are confident in your driving ability, take the driving test to obtain your driver's license.");
        System.out.println("6. Pay the fee: There is typically a fee for obtaining a driver's license, which varies by state.");
    }
    public void get_motorcycle_license(){
        System.out.println("1. Obtain a learner's permit: Before taking any motorcycle training courses, you will need to obtain a learner's permit by passing a written test on motorcycle laws and regulations.");
        System.out.println("2. Complete a motorcycle training course: Depending on your state, you may be required to complete a certified motorcycle training course. These courses typically include both classroom instruction and hands-on riding experience.");
        System.out.println("3. Pass a skills test: Once you have completed your motorcycle training course, you will need to pass a skills test to demonstrate your ability to operate a motorcycle safely.");
        System.out.println("4. Obtain a motorcycle license: After passing the skills test, you will be issued a motorcycle license or endorsement, which will allow you to legally operate a motorcycle on public roads.");
    }

    public void get_commercial_license(){
        System.out.println("1. Meet the basic requirements: You must be at least 18 years old (or 21 years old for interstate driving), possess a valid driver's license, and have no previous disqualifying convictions.");
        System.out.println("2. Obtain a commercial learner's permit (CLP): You must pass a written knowledge test specific to the type of commercial vehicle you plan to operate.");
        System.out.println("3. Practice driving with a CLP: You must practice driving with a CLP for a minimum of 14 days before taking the CDL skills test.");
        System.out.println("4. Pass the CDL skills test: The skills test consists of a pre-trip vehicle inspection, basic vehicle control, and on-road driving.");
        System.out.println("5. Obtain endorsements: Depending on the type of commercial vehicle you plan to operate, you may need to obtain additional endorsements. For example, a hazardous materials (HAZMAT) endorsement is required for drivers who transport hazardous materials.");
        System.out.println("6. Pay the necessary fees: There are various fees associated with obtaining a CDL, including application fees, testing fees, and endorsement fees. The specific fees vary depending on your state and other factors.");
    }

    public String report_license(String name, int age){
        return "Thank you for reporting the missing ID";
    }

}
