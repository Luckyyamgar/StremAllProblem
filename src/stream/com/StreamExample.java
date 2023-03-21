package stream.com;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		// 1.create a List object
		/*
		 * ArrayList<Integer>list=new ArrayList<Integer>(); list.add(12); list.add(15);
		 * list.add(19); System.out.println(list);
		 * 
		 * //2.,create list object List<Integer> list1 =
		 * List.of(12,14,2,4,6,16,17,19,21); //list1.add(100);// this is not add value
		 * in the List System.out.println(list1);
		 * 
		 * //3.create list List<Integer>li=new ArrayList<>(); li.add(100); li.add(200);
		 * System.out.println(li); //4.create list List<Integer> aslist =
		 * Arrays.asList(500,1000,1500); System.out.println(aslist);
		 */

		// List Without Stream boiler plate code
		/*
		 * List<Integer>list=Arrays.asList(1,2,3,14,8,28,29, 32);
		 * 
		 * List<Integer>listeven=new ArrayList<>();
		 * 
		 * for(Integer i:list) { if(i%2==0) { listeven.add(i);
		 * 
		 * } } System.out.println(list); System.out.println(listeven);
		 */

		// with using Stream
		List<Integer> list = Arrays.asList(1, 2, 3, 14, 8, 28, 29, 32);

		Stream<Integer> stream = list.stream();
		List<Integer> news = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(news);
     
		//reduced Line
		List<Integer> newlist = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newlist);
		
		List<Integer> lists = list.stream().filter(i->i>20).collect(Collectors.toList());
		System.out.println(lists);
	}
}
