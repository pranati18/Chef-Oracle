package drexel.dui.dto;

public class Dish {
	private int did;
	private String dname;
	private String directions;
	private int iid;
	private int cid;
	private int mid;
	private int calorie;
	
	
	public Dish() {
		// TODO Auto-generated constructor stub
	}
	
	public Dish(int did_, String dname_) {
		// TODO Auto-generated constructor stub
	did=did_;
	dname=dname_;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	}
