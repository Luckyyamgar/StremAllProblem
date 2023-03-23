package foreach.loop;

public class ForEaCH {
	public static void main(String[] args) {
		int[] number = {12, 17, 2, 6, 25, 8, 7 };

		System.out.println(number);
		// int a=number.length;
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("#################################################");
		for (int no : number) {
			System.out.println(no);
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		String[] value = { "Suchit","Jahangeer","pravin","pradip","Rahul" };

		for (int i = 0; i < value.length; i++) {

			 String va=value[i];
			System.out.println(va+" ");
		}
	}
}
