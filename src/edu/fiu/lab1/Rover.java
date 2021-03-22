/**
 * 
 */
package edu.fiu.lab1;

/**
 * @author Alex Vu
 *
 */
public class Rover {
	
	String powerStatus;
	int temperature;
	String connectionStatus;
	
	
	/**
	 * This method will allow the Rover to set the overall interal temperature.
	 */
	
	void setTemperature() {
		
		
	}
	
	/**
	 * This method will allow the rover to power on or off if a signal indicates to from Earth.
	 */
	
	void togglePowerOnOff() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Selfcheck for Antenna class.
		 */
		Antenna myAntenna = new Antenna();
		myAntenna.runSelfCheck();
		
		
		/**
		 * Selfcheck for temperature Sensor class.
		 */
		
		TemperatureSensor myTempSensor = new TemperatureSensor();
		myTempSensor.runSelfCheck();
	}

}
