package Hospital;

public class Patient implements EntityInterface,PersonInterface {
	private int idPatient;
	private String dni;
	private String fullName;
	private String streetAddress;
	private String phone;
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
		return dni;
	}
}
