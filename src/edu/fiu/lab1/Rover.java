/**
 * 
 */
package edu.fiu.lab1;

/**
 * @author Alex Vu
 *
 */
public class Rover {

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
		 * Selfcheck for temperature Sensor class
		 */
		
		TemperatureSensor myTempSensor = new TemperatureSensor();
		myTempSensor.runSelfCheck();
	}

}
