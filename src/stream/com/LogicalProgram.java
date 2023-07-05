package stream.com;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LogicalProgram {

	public static void main(String[] args) {
		
		
		List<Integer>listno= Arrays.asList(8,2,4,7,1,1,12,8,1,9);
		
	   Optional<Integer> stre = listno.stream().sorted().distinct().skip(1).findFirst();
		System.out.println(stre);
		//{1,1,2,2,4,7,8,9}
		
		Optional<Integer> se = listno.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(se);
	}
}
