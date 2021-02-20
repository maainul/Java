package Java8NewFeaturesdurgasoft;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDate {
    public static void main(String[] args) {
        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println(dateSupplier.get());

        Supplier<String> otpsupplier = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp += (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(otpsupplier.get());
    }
}
