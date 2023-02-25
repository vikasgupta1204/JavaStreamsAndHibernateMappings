package ConsumerInterface;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        ConsumerDemo consumerDemo=new ConsumerDemo();
        consumerDemo.accept("Ramesh");
    }
}
