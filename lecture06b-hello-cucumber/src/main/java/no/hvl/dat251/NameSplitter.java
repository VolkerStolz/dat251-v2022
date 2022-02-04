package no.hvl.dat251;

public class NameSplitter {

	public static String getFirstName(String theSuppliedFullName) {
		return theSuppliedFullName.split(" ")[0];
	}

	public static String getLastName(String theSuppliedFullName) {
		return theSuppliedFullName.split(" ")[1];
	}
}
