package chapter11.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface GumballMachineRemote extends Remote {
	int getCount() throws RemoteException;
	String getLocation() throws RemoteException;
	State getState() throws RemoteException;
}
