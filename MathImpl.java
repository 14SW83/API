import java.rmi.*;
import java.rmi.server.*;

public class MathImpl extends UnicastRemoteObject implements MathInterface{
	
	public MathImpl() throws RemoteException{
		System.out.println("MathImpl Constructor");
	}
	
	public String add(int a, int b) throws RemoteException{
		return ""+(a+b);
	}
	public String subtract(int a, int b) throws RemoteException{
		return ""+(a-b);
	}
	public String multiply(int a, int b) throws RemoteException{
		return ""+(a*b);
	}
	public String divide(int a, int b) throws RemoteException{
		return ""+(a/b);
	}
}