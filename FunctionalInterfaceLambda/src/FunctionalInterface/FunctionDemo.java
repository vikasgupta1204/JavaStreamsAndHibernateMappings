package FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<String,Integer> function=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(function.apply("Hello"));

        // example 1
        Function<String,Integer> fun1=(s)->{
            return s.length();
        };

        System.out.println(fun1.apply("Gallons"));

        //example 2
        Function<Integer,String> fun2= (num)->{return  num%2==0?"Number is even":"Number is odd";};
        System.out.println(fun2.apply(87));

        System.out.println(fun1.andThen(fun2).apply("Tomato"));


    }
}
