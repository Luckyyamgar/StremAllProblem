package AllBasicProgram;

public class This1 {
   void display() {
	  System.out.println("Hello How are You");
  }
 void show() {
	  display();// there is no use in this keyword by default use in this keyword
	  //this.display();
  }
}
 class supers extends This1{
	 
 
  public static void main(String[] args) {
	This1 s1=new This1();
	s1.show();
}
  
}
