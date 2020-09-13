package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Hospital.Patient;

public class patientTest {

	@Test
	public void test() {
		String testDni="4694223";
		String testPhone="054310258";
		String testStreetAddress="URB. Los angeles de Umacollo A-5, Arequipa, Arequipa, Arequipa";
		
		Patient patient = new Patient();
		patient.setDni(testDni);
		patient.setPhone(testPhone);
		patient.setStreetAddress(testStreetAddress);
		
		assertEquals(testDni,patient.getDni());
		assertEquals(testPhone,patient.getPhone());
		assertEquals(testStreetAddress,patient.getStreetAddress());
	}

}
