package Hospital;

public class Hospital implements EntityInterface {
	private String name;
	private String streetAddress;
	private String phone;
	private String fax;
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
}
