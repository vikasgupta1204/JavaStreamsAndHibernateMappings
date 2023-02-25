package lamdba;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable r1=()-> {
            for(int i=1;i<50;i++){

                System.out.println("Value of i is "+i+" for "+Thread.currentThread().getName());
            }
        };
        Runnable r2=()-> {
             for(int i=1;i<50;i++){
                 System.out.println("Value of i is "+i+" for "+Thread.currentThread().getName());
             }
        };

        Thread t=new Thread(r1);
        t.start();
        t.setName("Thread1");

        Thread t1=new Thread(r2);
        t1.setName("Thread2");
        t1.start();
    }
}
