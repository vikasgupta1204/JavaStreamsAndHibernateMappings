package ConsumerInterface;

import java.util.function.Consumer;

public class ConsumerAnonymousDemo {
    public static void main(String[] args) {
        Consumer consumerAnonymousDemo= new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumerAnonymousDemo.accept("Rakesh");
    }
}
