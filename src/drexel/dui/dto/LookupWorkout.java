package drexel.dui.dto;

public class LookupWorkout {
private String wname;
private int calorie_per_min;
private String time;
private String instructions;
private int calorie_count;

 
public LookupWorkout() {
	// TODO Auto-generated constructor stub
}

public LookupWorkout(String wname_) {
	// TODO Auto-generated constructor stub
	wname=wname_;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

public String getWname() {
	return wname;
}

public void setWname(String wname) {
	this.wname = wname;
}

public int getCalorie_per_min() {
	return calorie_per_min;
}

public void setCalorie_per_min(int calorie_per_min) {
	this.calorie_per_min = calorie_per_min;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public String getInstructions() {
	return instructions;
}

public void setInstructions(String instructions) {
	this.instructions = instructions;
}

public int getCalorie_count() {
	return calorie_count;
}

public void setCalorie_count(int calorie_count) {
	this.calorie_count = calorie_count;
}



}
