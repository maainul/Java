package interviewQuestions;

/*
1108. Defanging an IP Address
Easy

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".


Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */

public class _1108_DefangingAnIpAddress {

	public static void main(String args[]) {
		_1108_DefangingAnIpAddress obj = new _1108_DefangingAnIpAddress();
		String address = "255.100.50.0";

		String resultString = obj.defangIPaddrMain(address);
		System.out.println(resultString);

		String result = obj.defangIPaddr(address);
		System.out.println(result);
	}

	public String defangIPaddrMain(String address) {
		StringBuilder sbBuilder = new StringBuilder();

		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') {
				sbBuilder.append("[.]");
			} else {
				sbBuilder.append(address.charAt(i));
			}

		}

		return sbBuilder.toString();

	}

	// Input: address = "1.1.1.1"
	// Output: "1[.]1[.]1[.]1"
	public String defangIPaddr(String address) {
		StringBuilder sbBuilder = new StringBuilder();

		for (int i = 0; i < address.length(); i++) {
			char c = address.charAt(i);
			if (c != '.') {
				sbBuilder.append(c);
			} else {
				sbBuilder.append("[.]");
			}

		}

		return sbBuilder.toString();

	}

}
