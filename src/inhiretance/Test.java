package inhiretance;

 class Car {

	private void tata() {  
		System.out.println("This is tata car");
	}                     //private method Does not override
	
	public void BMW()	{
	System.out.println("This is BMW car");
	}
		public void fortuner() {
			System.out.println("This is Fortuner car");
		}
	}
class Bike  extends Car{
	@Override
	public void BMW() {
		super.BMW();
		System.out.println("This is Tata safari");
	}
		public void fortuner() {
			super.fortuner();
			System.out.println("This is Odi");
		}
	}
	
public class Test{
	public static void main (String []args) {
		Car c=new Bike(); 
		c.BMW();
		c.fortuner();
//		Car c1=new Car();         // By Using calling Super KeyWord
//		c1.BMW();
//		c1.fortuner();
		//c1.equals(c1);
		
		
	}
}
