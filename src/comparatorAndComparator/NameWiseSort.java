package comparatorAndComparator;
import java.util.Comparator;

public class NameWiseSort implements Comparator<People> {

	@Override
	public int compare(People o1, People o2) {

		return o1.name.compareTo(o2.name);
	}

}
