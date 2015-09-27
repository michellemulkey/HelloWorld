
public class VolcanoRobot {
	String status;  		//instance variable
    int speed;				//instance variable
    float temperature;		//instance variable	
 
    void checkTemperature() {
	    if (temperature > 660) {
	    	status = "returning home";
            speed = 5;
        }
    }
    void showAttributes() {
    	System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
 }
