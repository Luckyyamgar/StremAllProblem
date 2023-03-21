package AllBasicProgram;

public class StaticProg {

	String empName;
	int id;
	//String company;
	static  String company="Nexwave"; // Static Keyword are used in Memory Location loat of record use in the organazatation  

	public StaticProg(String empName, int id) {
	
		this.empName = empName;
		this.id = id;
		//this.company = company;
	}

	void display() {
    System.out.println(empName+" "+id+"  "+company );
	}
	
	public static void main(String[] args) {
		StaticProg st=new StaticProg("Jahangir", 1);
		//StaticProg st=new StaticProg("Jahangir", 1, "Nexwave"); // company name is Same
		st.display();
		StaticProg p=new StaticProg("Mhaku", 2);
		p.display();
	}
}