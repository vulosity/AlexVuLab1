/**
 * 
 */
package edu.fiu.lab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author Alex Vu
 *
 */
public class TemperatureSensor implements SelfCheckCapable {
	
	String status;
	int temperatureReading;
	
	
	/**
	 * This method will get temperature reading from the sensor.
	 * @return temperature from the sensor
	 */
	Rover getTemperature() {
		return null;
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Temperature Sensor";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.50);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}


}
