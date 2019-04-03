package game.entities;

import utilities.Point;

public class Entity {

	Point location;
	public Entity()
	{
		location=new Point(0,0);
	}
	public Entity(Point location) {
		this.location=new Point(location.getX(),location.getY());
		
	}
}
