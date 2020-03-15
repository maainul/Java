package OCA;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

	public static void main(String[] args) {
		List<Double> weight = new ArrayList<>();
		weight.add(50.0);
		//weight.add(new Double(60));
		weight.remove(50.0);
		double first = weight.get(0);
		System.out.println(first);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		System.out.println(numbers);
		numbers.remove(1);
		System.out.println(numbers);
		
		
		

	}

}
