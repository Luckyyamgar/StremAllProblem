package AllBasicProgram;

public abstract  class Abstration {
	int car; // we can Abstract method present class we need to the class name is Abstract

	public void abstrac() {
     System.out.println("This is Abstract method");
	}
   public   abstract  void add();
       abstract	 void bullet(); 
	   abstract void  shine();
	   abstract void add(int a,int b);
	   abstract void add(int a,int b,int c);

}

class A extends Abstration {
	static int c = 100;

	@Override
	void bullet() {
		int car = 12;
		System.out.println("250 bullet"+car);
	//static	int s=12;   Do not declar in Static variable in side the method 

	}

	public static void main(String[] args) {
		Abstration c = new A();// we does not create Abstract class object;
		c.bullet();
		c.shine();
		c.abstrac();
		c.add(10,20,30);
		c.add(100, 100);
		System.out.println(c.car);
	}

	@Override
	void shine() {
		// TODO Auto-generated method stub
		System.out.println("This is Shine two Wheeler is ver good bike");
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	void add(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println(a+b+c);
	}
}