package inhiretance;

import java.util.ArrayList;

public class SuppressWarning {
	@SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	ArrayList arr=new ArrayList<>();
	arr.add("Subhedar");
	arr.add("Senapati");
	arr.add(123);
	//System.out.println(arr);
	for(Object ob:arr) {
		System.out.println(ob);
		
		
		ArrayList<String>list=new ArrayList<>();
		list.add("123");
		list.add("Geetai");
		list.add("GPM");
		list.add("KEC");
		//System.out.println(list);
		for(String s:list) {
			System.out.println(s);
		}
		
	}
}
}
