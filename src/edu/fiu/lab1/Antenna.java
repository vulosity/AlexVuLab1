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
public class Antenna implements SelfCheckCapable {
	
	String lowgainAntenna;
	String highgainAntenna;
	
    
	/**
	 * This method will use the lowgainAntenna to send a signal to the Deep Space Network (DSN).
	 */
	void sendSignalToDSN() {
		
	
	}
	
	/**
	 * This method will use the highgainAntenna to send a signal to Earth.
	 * 
	 */
	
	void sendSignalToEarth() {
		
	
	}
	
	/**
	 * This method will rotate the highgain Antenna.
	 */
	void highgainRotate() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Antenna";
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
