package game.entities.sportsman;

import game.entities.MobileEntity;

public class Sportsman extends MobileEntity{
	
	private String name;
	private double age;
	private String gender;
	
	public Sportsman(String name, double age, String gender, double maxSpeed, double acceleration) {
		super(maxSpeed, acceleration);
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}
}
