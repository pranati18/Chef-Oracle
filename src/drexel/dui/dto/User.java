package drexel.dui.dto;

public class User {
	private String uname;
	private String upass;
	private String utype;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", upass=" + upass + ", utype=" + utype + "]";
	}

}
