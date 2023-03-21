package AllBasicProgram;

public class SuperKeyword {
int a=10;

}
class D extends SuperKeyword{   //Super class me Inheritence concept use hota hai
	int a=20;  
	
	public void Add(int a) {
		
		System.out.println(a);  //o/p =30
	System.out.println(this.a); //o/p=20
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		D d=new D();
		d.Add(30);// O/p =30;
	}
}