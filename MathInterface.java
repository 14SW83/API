import java.rmi.*;

public interface MathInterface extends Remote{
	public String add(int a, int b) throws RemoteException;
	public String subtract(int a, int b) throws RemoteException;
	public String multiply(int a, int b) throws RemoteException;
	public String divide(int a, int b) throws RemoteException;
}