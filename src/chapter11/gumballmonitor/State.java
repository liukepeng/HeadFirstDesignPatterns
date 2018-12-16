package chapter11.gumballmonitor;

import java.io.Serializable;

interface State extends Serializable {
 
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
