package AllBasicProgram;

public class Static {
	public static void car() {                //static method we donot create classs object 
		
		 int a=10;
		System.out.println("fortuner");
	}

	public static void home() {
		System.out.println("1 BHK");
	}
}
class Employee{
	static void cat() {
		System.out.println("cat mawo mawo");
	}
	public static void main(String[] args) {
		   cat();
		   Static.car();
		   Static .home();
	}
}