/**
 * 
 */
/**
 * @author pranatishrivastava
 *
 */
package drexel.dui.dto;

public class Cuisine{

private int cid;
private String cname;
private String ctype;

public Cuisine() {
	// TODO Auto-generated constructor stub
}
public Cuisine(int cid_,String cname_,String ctype_) {
	// TODO Auto-generated constructor stub
	cid=cid_;
	cname=cname_;
	ctype=ctype_;
	
}

public Cuisine(String cname_) {
	// TODO Auto-generated constructor stub
	cname=cname_;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getCtype() {
	return ctype;
}

public void setCtype(String ctype) {
	this.ctype = ctype;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}