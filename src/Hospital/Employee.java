package Hospital;

public class Employee implements EntityInterface,PersonInterface {
	private String dni;
	private String streetAddress;
	private String phone;
	private String jobTitle;
	@Override
	public void setStreetAddress(String streetAddress) {
		this.streetAddress=streetAddress;
	}
	@Override
	public String getStreetAddress() {
		return streetAddress;
	}
	@Override
	public void setPhone(String phone) {
		this.phone=phone;
	}
	@Override
	public String getPhone() {
		return phone;
	}
	@Override
	public void setDni(String dni) {
		this.dni=dni;
	}
	@Override
	public String getDni() {
		return this.dni;
	}
	
}
