package stream.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremBasic {
	public static void main(String[] args) {
		
		List<Integer>number=List.of(12,13,8,9,14,17,19,14);
		
		List<Integer>num=Arrays.asList(2,14,12,8,3,7,9);
		
		
		List<Integer>even=new ArrayList<>();
		
		
		//Add list number in even
		
		for(Integer i:number) {
			if(i%2==0) {
				
				even.add(i);
				
			}
			
		}
		System.out.println(even);
		System.out.println(number);
		
		//Using Stream Api
		List<Integer> evennumber = num.stream().filter(e->e%2==0).collect(Collectors.toList());
		even.addAll(evennumber);
		System.out.println(evennumber);
	}
	
	
	//Stream Api where can use
	// -Collection object
	// -Group of -object
	
	
	
	
	

}
