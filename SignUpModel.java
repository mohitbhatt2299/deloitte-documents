package signup.model;

public class SignUpModel {
	private int userId;
	private String email;
	private String name;
	private String fatherName;
	private String motherName;
	private String address;
	private long contact;
	private String gender;
	private String password;

	public SignUpModel() {

	}

	public SignUpModel(int userId, String email, String name, String fatherName, String motherName, String address,
			long contact, String gender, String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
		this.contact = contact;
		this.gender = gender;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fathername) {
		this.fatherName = fathername;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String mothername) {
		this.motherName = mothername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String toString() {
		return "SignUpModel [userId=" + userId + ", email=" + email + ", name=" + name + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", address=" + address + ", contact=" + contact + ", gender=" + gender
				+ ", password=" + password + "]";
	}

	public void addUserInfo(SignUpModel signObj) {
		// TODO Auto-generated method stub
		
	}

}
