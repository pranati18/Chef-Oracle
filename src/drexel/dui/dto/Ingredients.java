package drexel.dui.dto;

public class Ingredients {
private int iid;
private String inname;
private String intype;

public Ingredients() {
	// TODO Auto-generated constructor stub
}
public Ingredients(int iid_,String inname_, String intype_) {
	// TODO Auto-generated constructor stub
	iid=iid_;
	inname=inname_;
	intype=intype_;
	
}
public int getIid() {
	return iid;
}

public void setIid(int iid) {
	this.iid = iid;
}

public String getInname() {
	return inname;
}

public void setInname(String inname) {
	this.inname = inname;
}

public String getIntype() {
	return intype;
}

public void setIntype(String intype) {
	this.intype = intype;
}

}
