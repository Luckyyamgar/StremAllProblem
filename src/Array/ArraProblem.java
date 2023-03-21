package Array;

import java.util.ArrayList;
import java.util.List;

public class ArraProblem {
public static void main(String[] args) {
	try {
	int []i=new int[4];// Arry
	i[1]=12;
	i[0]=14;
	i[2]=100;
	i[3]=50;
	//i[4]=30; Array index out of boundry Exception
	
	System.out.println(i[0]);
	System.out.println("Arry length is"+i.length);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	

	String []lis= {"1","13","17"} ;
	System.out.println(lis);
	
	
	ArrayList add = new ArrayList<>();   // Array list
	
	List a=new ArrayList<>();
	a.add(12);
	a.add("Mhaku");
	a.add(13);
	a.add(12.13);
	a.add(lis);
	System.out.println(a);
	System.out.println(a.size());
	
}

}