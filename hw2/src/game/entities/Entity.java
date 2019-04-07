package game.entities;

import utilities.Point;

public class Entity {

	private Point location;
	public Entity()
	{
		setLocation(new Point(0,0));
	}
	public Entity(Point location) {
		this.setLocation(new Point(location.getX(),location.getY()));
		
	}
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
}
