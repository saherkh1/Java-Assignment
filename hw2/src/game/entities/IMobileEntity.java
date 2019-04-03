package game.entities;

import utilities.Point;

public interface IMobileEntity {
	public Void move(double friction) ;
	public Point getLoction();



}