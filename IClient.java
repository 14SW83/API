import java.rmi.*;

class IClient{
	public static void main(String[] args){
		MathInterface math;
		String name = "rmi://localhost/MathServer";
		try{
			math = (MathInterface)Naming.lookup(name);
			System.out.println(math.add(2,5));
			System.out.println(math.subtract(2,5));
			System.out.println(math.multiply(2,5));
			System.out.println(math.divide(2,5));
		}
		catch(Exception e){
			System.out.println("IClient exception: "+e);
		}
	}
}