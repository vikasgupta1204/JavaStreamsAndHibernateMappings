package PredicateInterface;

import com.sun.source.tree.BreakTree;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo implements Predicate<Integer> {


    @Override
    public boolean test(Integer integer) {
        return integer%2==0;
    }

    public static void main(String[] args) {
        PredicateDemo pred=new PredicateDemo();
        Boolean ans=pred.test(89);
        System.out.println(ans);


        Predicate<Integer> predicate1=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==1;
            }
        };

        System.out.println(predicate1.test(87));
        Predicate<Integer> predicate2=(x)->{return x%5==3;};
        System.out.println(predicate2.test(78));

        List<Integer>  list1=List.of(13,24,54,11,25,53,28,42,56,22,64,75,87,90);
        Predicate<Integer> pr1=(x)-> x%3==1;
        Predicate<Integer> pr2=(x)->x%4==3;
       // list1.stream().filter((x)->{return x%7==5;}).collect(Collectors.toList()).forEach(System.out::println);
        list1.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList()).forEach(System.out::println);

    }



}
