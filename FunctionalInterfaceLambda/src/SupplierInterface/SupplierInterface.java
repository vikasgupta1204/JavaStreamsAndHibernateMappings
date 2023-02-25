package SupplierInterface;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier=new Supplier<LocalDateTime>() {
            @Override
            public LocalDateTime get() {
                return LocalDateTime.now();
            }
        };
        System.out.println(supplier.get());

        Supplier<LocalDateTime> supplier1=()->LocalDateTime.now();

        System.out.println(supplier1.get());

        Supplier<List<Product>> productSupplier=()->{
            List<Product> productList=new ArrayList<Product>();
            productList.add(new Product(1,"Dell Laptop",26000));
            productList.add(new Product(2,"HP Laptop",66000));

            productList.add(new Product(3,"Lenevo Laptop",53000));
            productList.add(new Product(4,"Apple Laptop",43000));
            productList.add(new Product(5,"Sony Laptop",65000));

            productList.add(new Product(6,"Asus Laptop",75000));
            return productList;
        };

        //System.out.println(productSupplier.get());
        System.out.println(productSupplier().get());
    }

    private static Supplier<List<Product>> productSupplier(){
        Supplier<List<Product>> productSupplier=()->{

                    List<Product> productList=new ArrayList<Product>();
                    productList.add(new Product(1,"Dell Laptop",26000));
                    productList.add(new Product(2,"HP Laptop",66000));

                    productList.add(new Product(3,"Lenevo Laptop",53000));
                    productList.add(new Product(4,"Apple Laptop",43000));
                    productList.add(new Product(5,"Sony Laptop",65000));

                    productList.add(new Product(6,"Asus Laptop",75000));
                    return productList;
        };

        return  productSupplier;

    }
}
