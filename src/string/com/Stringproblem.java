package string.com;

public class Stringproblem {

	public static void main(String[] args) {
		String str=new String("javaDevloper");//String Are UnMuteble donot change in value of object
		//String str="JavaDevloper";
		str.concat("Software");
		System.out.println(str);
		
		StringBuffer br=new StringBuffer("javaDeploper"); // String Buffer is Muteble change in Object of value
		br.append("Software");
		System.out.println(br);
		
		System.out.println("_____________________________________________________________________________________________");
		String s="Lucky";
		String s1=new String("Lucky");
		String s2=new String("Lucky");
		System.out.println(s1==s2);//false  checking memory location
		System.out.println(s1.equals(s2)); //true  //checking contrnt comparisum
		System.out.println(s==s1);//False
		System.out.println("what is Actual=="+s.equals(s1));//true
		System.out.println("__________________________________________________");
		
		StringBuffer s3= new StringBuffer("lucky");
		StringBuffer s4= new StringBuffer("lucky");
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//false // checking memory Location  reference comparisum
		
		System.out.println("##########################################################");
		char []ch= {'j','a','v','a'};
		String st=new String(ch);
		System.out.println(st);
		
		byte []by= {99,98,97,96};
		String b=new String(by);
		System.out.println(b);
	}
}
