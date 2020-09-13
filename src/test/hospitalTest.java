package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Hospital.Hospital;

public class hospitalTest {

	@Test
	public void test() {
		String testPhone="054-457455";
		String testStreetAddress="AV. EL EJERCITO XXX";
		
		Hospital hospital = new Hospital();
		hospital.setPhone(testPhone);
		hospital.setStreetAddress(testStreetAddress);
		
		assertEquals(testPhone,hospital.getPhone());
		assertEquals(testStreetAddress,hospital.getStreetAddress());
	}

}
