package stream.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamArray {
	public static void main(String[] args) {
		// 1- blank //filter -Filter can retrive the valu of list return tru or false
		// Map- map can be every element can be perform opration
		Stream<Object> emptyStream = Stream.empty();

		// 2- array, object ,collection

		String names[] = { "mhaku", "Onkar", "Pradip", "Koushalya" };

		Stream<String> name1 = Stream.of(names);

		name1.forEach(e -> {
			System.out.println(e);
		});
		// builder use
		Stream<Object> streamBuider = Stream.builder().build();

		// List,set par jada use karte hai
		List<Integer> listno = Arrays.asList(12, 13, 2, 15, 14, 8);
		List<Integer> even = listno.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		Optional<Integer> smallsecond = listno.stream().sorted().skip(1).findFirst();
		System.out.println(smallsecond);

		System.out.println(even);

		listno.stream().forEach(e -> {
			System.out.println(e);
		});

		// find the number of startwith A by using filter
		List<String> listname = Arrays.asList("Amit", "Aman", "Akash", "suchi", "Mhaku", "Onkar");

		List<String> listn = listname.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(listn);
		List<String> lis = listname.stream().filter(e -> e.startsWith("M", 1)).collect(Collectors.toList());
		System.out.println(lis);

		// where is use map filter

		List<Integer> Arr = List.of(12, 2, 4, 7, 8, 9, 11);

		List<Integer> newArr = Arr.stream().map(e -> e * e).collect(Collectors.toList());
		Integer min = Arr.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("Minimum=" + min);
		System.out.println(newArr);

		Arr.stream().map(e -> e * e).forEach(i -> { // this is foreach loop
			System.out.println(i);
		});
		System.out.println("***********************************************");// Simple using Foreach method print
																				// Variable
		Arr.stream().forEach(System.out::println);
	}

}
