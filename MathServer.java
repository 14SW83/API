import java.rmi.*;

public class MathServer{
	public static void main(String[] args){
		try{
			Naming.rebind("rmi://localhost/MathServer", new MathImpl());
			System.out.println("Math Server is ready.");
		}catch(Exception e){
			System.out.println("Math Server failed: "+ e);
		}
	}
}