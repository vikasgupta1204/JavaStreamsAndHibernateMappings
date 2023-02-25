package FilterDemo;

import java.util.Arrays;
	import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

	public class StreamMain1 {
	public static void main(String[] args) {
	   /*create a list and filter all even numbers from the list */

	   /*List.of creates immutable list object. We cant add more items in it 
	   we will get Unsupported operation exception.
	   */
	   
	   List<Integer> list1=List.of(2,5,10,100,101,62,66,53,71,5,10,101,100,98);
	    System.out.println(list1);

	    List<Integer> list2=Arrays.asList(23,567,30,101,205,307,874,242);

	    System.out.println(list2);

	    List<Integer> evenlist=list1.stream().filter(x->x%2==0).collect(Collectors.toList());
	    System.out.println(evenlist);
	    
	    List<Integer> elemgreaterthan50=list1.stream().filter(i->i>60).collect(Collectors.toList());
	    System.out.println(elemgreaterthan50);
	    
	    List<Integer> distictelem=list1.stream().distinct().toList();
	    System.out.println(distictelem);
	    
	    boolean res=list1.stream().allMatch(i->i%2==0);
	    System.out.println(res);

	}    
	}

