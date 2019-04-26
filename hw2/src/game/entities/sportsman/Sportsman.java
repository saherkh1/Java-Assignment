package game.entities.sportsman;

import game.entities.MobileEntity;
import game.enums.Gender;

public class Sportsman extends MobileEntity{
	
	private String name;
	private double age;
	private Gender gender;
	
	public Sportsman(String name, double age, Gender gender, double acceleration, double maxSpeed) {
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}
}
