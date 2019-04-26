package game.competition;

import java.util.ArrayList;
import game.arena.WinterArena;
import game.entities.sportsman.WinterSportsman;
import utilities.ValidationUtils;

public abstract class Competition {

	private WinterArena arena;
	private int maxCompetitors;
	private ArrayList<Competitor> activeCompetitors;
	private ArrayList<Competitor> finishedCompetitors;
	
	public Competition(WinterArena arena,int maxCompetitors) {
		activeCompetitors = new ArrayList<Competitor>();
		finishedCompetitors = new ArrayList<Competitor>();
		this.setArena(arena);
		this.setMaxCompetitors(maxCompetitors);
	}
	
	public abstract boolean isValidCompetitor(Competitor competitor);
	public abstract void addCompetitor(Competitor competitor);
	public void playTurn() {
		ArrayList<Competitor> arr = new ArrayList<Competitor>(activeCompetitors);
		for(Competitor racer : arr) {
			((WinterSportsman) racer).move(arena.getFriction());
			if(this.getArena().isFinished(((WinterSportsman)racer))) {
				finishedCompetitors.add(racer);
				activeCompetitors.remove(racer);
			}
		}
	}
	public boolean hasActiveCompetitors() {
		return !(this.activeCompetitors.isEmpty());
	}

	
	public WinterArena getArena() {
		return arena;
	}

	public void setArena(WinterArena arena) {
		ValidationUtils.assertNotNull(arena);
		this.arena = arena;
	}

	public int getMaxCompetitors() {
		return maxCompetitors;
	}

	public void setMaxCompetitors(int maxCompetitors) {
		ValidationUtils.assertNotNegative(maxCompetitors);
		this.maxCompetitors = maxCompetitors;
	}

	public ArrayList<Competitor> getActiveCompetitors() {
		return activeCompetitors;
	}

	public ArrayList<Competitor> getFinishedCompetitors() {
		return finishedCompetitors;
	}


}
