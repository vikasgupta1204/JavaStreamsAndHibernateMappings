package SupplierInterface;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<LocalDate> {

    @Override
    public LocalDate get() {
            return LocalDate.now();
    }

    public static void main(String[] args) {
        SupplierDemo sp=new SupplierDemo();
        LocalDate date=sp.get();
        System.out.println(date);
    }
}
