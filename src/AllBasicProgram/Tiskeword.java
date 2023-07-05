package AllBasicProgram;

public class Tiskeword {// this keyword refer only current class
	int a;

//	public void Add(int x) {  // agar variable same Hote hai to 
//		a = x;
//
//	}
	public void Add(int a) {
		// a=a; // o no otput because confuesion which object can be assign
		this.a = a; // local variable and Instent variable name are Same in that Time using This
					// keword
	}

	void Addi() {
		System.out.println(a);
	}

}

class Test {
	public static void main(String[] args) {

		Tiskeword t1 = new Tiskeword();
		t1.Add(10);
		t1.Addi();

	}
}