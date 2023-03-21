package AllBasicProgram;

public class Superclass {

	public void car() {
		System.out.println("Fortuner car");
	}

}

class Sub extends Superclass {
	public void tractor() {
		this.car(); // refer to the method of parient class  // o/p BMW car
		super.car();//o/p Forctuner car
		System.out.println("Arjun 555");
	}

	public void car() {
     System.out.println("BMW Car");
	}

	public static void main(String[] args) {

		Sub s = new Sub();

		s.tractor();
	}
}