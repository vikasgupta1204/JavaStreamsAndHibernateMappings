package StreamObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {
public static void main(String[] args) {
	//Stream API - collection process
	//collection //group of objects
	//1-blank
	Stream<Object> emptyStream=Stream.empty();
	emptyStream.forEach(e->System.out.println(e));
	
	//2-stream array,collections
	String names[]= {"rrr","aad","ssss","wwww","uuuu","ooooo","wwdddd","wsswww","wwwsssss"};
	Stream<Object> namestream=Stream.of(names);
	namestream.forEach(e->{
		System.out.print(e+" ");
	});
	//System.out.println(Arrays.stream(names).filter(e->e.startsWith("ww")).collect(Collectors.toList()));
	
	List<Integer> list1=List.of(55,32,11,33,98,76,50,49,43,28);
	list1.stream().forEach(e->{System.out.println(e);});
	
	Integer val=list1.stream().max(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1-o2;
		}
	
	}).get();
	
	System.out.println(val);
}
}
