package AllBasicProgram;

public class StaticMemoryCreation {

int id;
	String name;
	static String  companyName="Nexwave";

	public  StaticMemoryCreation(int id ,String name) {
		this.id=id;
		this.name=name;
		
	}
	
public  void show() {
	System.out.println(id +" "+name+" "+companyName);
}
	public static void main(String[] args) {
		
		StaticMemoryCreation s=new StaticMemoryCreation(1, "mhaku");
		StaticMemoryCreation s1= new StaticMemoryCreation(2,"sudhir");
		s1.show();
		s.show();
		
	}
	
}
