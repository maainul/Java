package dataStructureAndAlgorithm._1_array;

public class Array {
	int array[] = new int[5];
	int searchValue;
	int i, size, count;

	public void insertArray(int data) {
		array[i] = data;
		i++;
		size++;
	}

	// insert using index number
	public void insertAt(int index, int data) {
		for (int i = 0; i < array.length; i++) {
			if (i == index) {
				array[i] = data;
			}

		}
	}

	// delete using value...
	public void delete(int data) {
		boolean flag = false;
		int i = 1;
		for (i = 0; i < size; i++) {
			if (array[i] == data) {
				for (int j = i; j < size; j++) {
					array[j] = array[j + 1];
				}
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Delete successfully");
		} else {
			System.out.println("Elemnet is not found...");
		}
	}

	// delete using index number...
	public void deleteAt(int index) {
		boolean flag = false;
		int i = 1;
		for (i = 0; i < size; i++) {
			if (i == index) {
				for (int j = i; j < size; j++) {
					array[j] = array[j + 1];
				}
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Delete successfully");
		} else {
			System.out.println("Elemnet is not found...");
		}
	}

	// remove value which is duplicate
	// 1,1,2,3,4,4,11,
	// result : 1,2,3,4,11
	// first we have to sort the element
	// then find duplicate
	public void removeDuplicate() {

		System.out.println("Value Before sorting sorted : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("\n\nAfter sorting : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		int current = array[0];

		System.out.println("\n\nAfter removing");
		for (int i = 0; i < array.length; i++) {
			if (current != array[i]) {
				System.out.print(current + " ");
				current = array[i];
			}

		}
		System.out.print(current + " ");
	}

	// search value
	public void search(int searchValue) {
		boolean flag = false;
		int i = 1;
		for (i = 0; i < size; i++) {
			if (array[i] == searchValue) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Element " + searchValue + " is present in the index number: " + i);
		} else {
			System.out.println("Elemnet is not found...");
		}
	}

	// display value...
	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
