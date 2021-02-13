package comparatorAndComparator;
import java.util.Comparator;

public class AddressWiseSort implements Comparator<People> {

	@Override
	public int compare(People o1, People o2) {
		return o1.address.compareTo(o2.address);
	}

}
