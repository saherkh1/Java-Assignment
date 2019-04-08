package game.arena;

import game.entities.IMobileEntity;

public interface IArena {
	
	public double getFriction();
	Boolean isFinished(IMobileEntity me);

}
