package lamdba;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        MyInterface m1=new MyInterImpl();
        m1.sayHello();

        MyInterface m2=new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("I am saying hello from anonymous class");
            }
        };

       m2.sayHello();

       //using our functional interface with the help of lambda

        MyInterface m3=()->{
            System.out.println("This is lambda implementation of functional interface");
        };

    m3.sayHello();

    MyInterface m4=()-> System.out.println("This is 2nd lambda implementation of funnctional interface");
    m4.sayHello();

    SumInter s1=(a,b)->{return (a+b);};
    SumInter s2=(a,b)->a+b;
        System.out.println(s2.sum(78,89));

        System.out.println(s1.sum(55,66));
    }
}
