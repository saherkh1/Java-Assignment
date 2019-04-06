package game.entities;

public class MobileEntity extends Entity{
	private double maxSpeed;
	private double acceleration;
	private double Speed;
	
	public MobileEntity(double maxSpeed, double acceleration){
		super();
		this.setMaxSpeed(maxSpeed);
		this.setAcceleration(acceleration);
		this.setSpeed(0);
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	public double getSpeed() {
		return Speed;
	}

	public void setSpeed(double speed) {
		Speed = speed;
	}
}
