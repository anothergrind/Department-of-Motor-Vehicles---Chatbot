/*
 * This class is supposed to hold all of the potential options a user has
 * in the chatbot
 */
public class Options {
    public String look_up_car(String make, String model, int year){
        return "";
    }

    public boolean renew_vehicle(boolean renew){
        if(renew == true){
            return true; 
        }
        else
        {
            return false;
        }
    }

    public void sign_up(){

    }

    public int pay(){
        return 0;
    }

    public String change_address(String oldAddress, String newAddress){
        return "";
    }

    public void get_drivers_license(){

    }
    public void get_motorcycle_license(){

    }

    public void get_commercial_license(){

    }

    public void report_license(){

    }

}
