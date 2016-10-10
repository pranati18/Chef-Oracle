package drexel.dui.dto;

public class UserProfile {
	private String uname;
	private String upass;
	private String utype;
	private String fpref;
	private String cpref;
	
	public UserProfile() {
		// TODO Auto-generated constructor stub
	}

	public UserProfile(String uname_,String upass_,String utype_,String fpref_,String cpref_) {
		// TODO Auto-generated constructor stub
		uname=uname_;
		upass=upass_;
		utype=utype_;
		fpref=fpref_;
		cpref=cpref_;
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

	public String getFpref() {
		return fpref;
	}

	public void setFpref(String fpref) {
		this.fpref = fpref;
	}

	public String getCpref() {
		return cpref;
	}

	public void setCpref(String cpref) {
		this.cpref = cpref;
	}
	
	
}
