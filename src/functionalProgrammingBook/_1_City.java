package functionalProgrammingBook;

import oopConcept.memberModifiers.publicModifier.pack2.B;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _1_City {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("atlanta");
        cities.add("washington");
        cities.add("chicago");

        // First way : Verbose and Old school
        boolean found = false;

        for(String city : cities){
            if (city.equals("chicago")){
                found = true;
                break;
            }
        }
        System.out.println("City Found ?"+found);

        // better way
        System.out.println("City Found ? "+ cities.contains("chicago"));

        // Second Beyond simple

        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"),
                new BigDecimal("10"),
                new BigDecimal("30"),
                new BigDecimal("17"),
                new BigDecimal("20"),
                new BigDecimal("15"),
                new BigDecimal("18"),
                new BigDecimal("45"),
                new BigDecimal("12")
        );
//        BigDecimal totalDiscountedPrice = BigDecimal.ZERO;
//        for (BigDecimal price : prices){
//            if (price.CompareTo(BigDecimal.valueOf(20)) > 0){
//                totalDiscountedPrice = totalDiscountedPrice.add(price.multiply(BigDecimal.valueOf(0.9)));
//            }
//        }
//        System.out.println("Total of Discount prices " +totalDiscountedPrice);
    }

}
