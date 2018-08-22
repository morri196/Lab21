package co.grandcircus.Lab21.entity;

public class Users {
	private int id;
	private String firstname;
	private String lastname;
	private String phonenumber;
	private String email;
	private String password;
	
	public Users() {}
	
	public Users(int id, String firstname, String lastname, String phonenumber, String email, String password) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
	}
	
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
