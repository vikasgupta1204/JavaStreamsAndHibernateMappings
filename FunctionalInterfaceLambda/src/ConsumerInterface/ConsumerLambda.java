package ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {
        //example1
        Consumer<String> consumer=(s)->{
            System.out.println(s);
        };

        consumer.accept("Aakash");

        //example2
         Consumer<String> consumer2=(input)->{
             System.out.println(input+" for consumer 2");
         };

         Consumer<String> consumer3=(input)->{
             System.out.println(input+" for consumer 3");
         };

         consumer2.andThen(consumer3).accept("hello");

         List<Integer> integers= Arrays.asList(1,2,4,5,6,8,9,10,11);
//         integers.stream().forEach((i)->{
//             System.out.println(i);
//         });

         Consumer<Integer> consumer4=(t)->{
             System.out.println(t);
         };
         integers.forEach(consumer4);


    }
}
