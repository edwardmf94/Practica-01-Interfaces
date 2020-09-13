package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Hospital.Employee;

public class employeeTest {

	@Test
	public void test() {
		String testDni="4694223";
		String testPhone="054310258";
		String testStreetAddress="URB. Los angeles de Umacollo A-5, Arequipa, Arequipa, Arequipa";
		
		Employee employee = new Employee();
		employee.setDni(testDni);
		employee.setPhone(testPhone);
		employee.setStreetAddress(testStreetAddress);
		
		assertEquals(testDni,employee.getDni());
		assertEquals(testPhone,employee.getPhone());
		assertEquals(testStreetAddress,employee.getStreetAddress());
	}

}
