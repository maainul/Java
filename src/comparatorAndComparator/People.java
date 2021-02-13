package comparatorAndComparator;

public class People implements Comparable<People> {

	String name;
	int id;
	String address;

	public People(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(People o) {
		Integer i = this.id;
		return i.compareTo(o.id);
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

}