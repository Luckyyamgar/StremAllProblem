package stream.com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		// stream Api Collection process
		// collection /Grroup of object

		// blank stream

//		  Stream<Object> object = Stream.empty();
//	
//		  
//		  object.forEach(e ->{
//			  System.out.println(e);
//		  });

		// create Array object
		// Stream< Object>stream=Stream.empty();
		String name[] = { "lucky", "sursj", "jahangir", "manus" };

		Stream<String> str = Stream.of(name);

		str.forEach(e -> {
			System.out.println(e);
		});

		// when we use filter

		List<String> nam = List.of("pooja", "prinka", "sujata", "kiran", "pranita");
		List<String> newlis = nam.stream().filter(e -> e.startsWith("p")).collect(Collectors.toList());

		System.out.println(newlis);

		// when we map

		List<Integer> num = List.of(2, 12, 6, 10);
		List<Integer> newno = num.stream().map(m -> m * m).collect(Collectors.toList());
		System.out.println(newno);
	}
}


