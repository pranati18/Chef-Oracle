package drexel.dui.dto;

public class Ratings {
	private int rid;
	private int stars;
	private String comments;
	private int did;
	 public Ratings() {
		// TODO Auto-generated constructor stub
	}
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}
	 
	 
}
