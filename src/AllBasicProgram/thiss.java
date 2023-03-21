package AllBasicProgram;

public class thiss {
	thiss() {
		System.out.println("No Argument Contructure");
	}

	thiss(String string) {
		this(); // this key word are used in another constructor
		System.out.println("Argument Constructure");

	}

	public static void main(String[] args) {
		// thiss t=new thiss();//o/p no argument constructure

		thiss s = new thiss("Lucky");// orgument Constructure
	}
}
