package a11.proxy_pattern.gumball_monitor;

import java.io.*;

public interface State extends Serializable {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
