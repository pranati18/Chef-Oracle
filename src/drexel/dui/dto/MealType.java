package drexel.dui.dto;

public class MealType {
private int mid;
private String mname;

public MealType() {
	// TODO Auto-generated constructor stub
}
public MealType(int mid_,String mname_) {
	// TODO Auto-generated constructor stub
	mid=mid_;
	mname=mname_;
}
public MealType(String mname_) {
	// TODO Auto-generated constructor stub
	
	mname=mname_;
	
}
public int getMid() {
	return mid;
}

public void setMid(int mid) {
	this.mid = mid;
}

public String getMname() {
	return mname;
}

public void setMname(String mname) {
	this.mname = mname;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
