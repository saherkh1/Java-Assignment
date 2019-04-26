package game.arena;

import game.entities.IMobileEntity;
import game.enums.SnowSurface;
import game.enums.WeatherCondition;

public class WinterArena implements IArena{
	
	private double length;
	private SnowSurface surface;
	private WeatherCondition condition;
	
	public WinterArena(double length, SnowSurface surface, WeatherCondition cond){
		this.setLength(length);
		this.setCondition(cond);
		this.setSurface(surface);
	}

	@Override
	public double getFriction() {
		return this.getSurface().getFriction();
	}

	@Override
	public Boolean isFinished(IMobileEntity me) {
		if (me.getLoction().getX()>=this.getLength())
			return true;
		return false;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public WeatherCondition getCondition() {
		return condition;
	}

	public void setCondition(WeatherCondition condition) {
		this.condition = condition;
	}

	public SnowSurface getSurface() {
		return surface;
	}

	public void setSurface(SnowSurface surface) {
		this.surface = surface;
	}

}
