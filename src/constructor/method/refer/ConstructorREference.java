package constructor.method.refer;

public class ConstructorREference {

	public static void main(String[] args) {
		
		Messageable message=Message::new;      //Constructor method references
		message.getmess(" hell Hoew Are you");
		System.out.println("");
	}
}
