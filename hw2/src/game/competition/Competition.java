package game.competition;

import java.util.ArrayList;
import game.arena.IArena;
import game.entities.sportsman.WinterSportsman;

public abstract class Competition {

	private IArena arena;
	private int maxCompetitors;
	private ArrayList<Competitor> activeCompetitors;
	private ArrayList<Competitor> finishedCompetitors;
	
	public Competition(IArena arena,int maxCompetitors) {
		activeCompetitors = new ArrayList<Competitor>();
		finishedCompetitors = new ArrayList<Competitor>();
		this.setArena(arena);
		this.setMaxCompetitors(maxCompetitors);
	}
	
	public abstract boolean isValidCompetitor(Competitor competitor);
	public abstract void addCompetitor(Competitor competitor);
	public void playTurn() {
		ArrayList<Competitor> arr = new ArrayList<Competitor>();
		arr.addAll(activeCompetitors);
		int i=-1;
		if (!hasActiveCompetitors()) {
			System.out.println("race finished!!!");
			int a=0;
			for(Object racer : this.finishedCompetitors) {
				System.out.println("#"+(a+1)+" "+racer);
				a++;
			}
		}
		else
			for(Competitor racer : arr) {
				i=arr.indexOf(racer);
				((WinterSportsman)racer).move(arena.getFriction());
				if(this.getArena().isFinished(((WinterSportsman)racer))) {
					finishedCompetitors.add(racer);
					activeCompetitors.remove(i);
				}
			}
	}
	public boolean hasActiveCompetitors() {
		return !(this.activeCompetitors.isEmpty());
	}

	

	public IArena getArena() {
		return arena;
	}

	public void setArena(IArena arena) {
		this.arena = arena;
	}

	public int getMaxCompetitors() {
		return maxCompetitors;
	}

	public void setMaxCompetitors(int maxCompetitors) {
		this.maxCompetitors = maxCompetitors;
	}

	public ArrayList<Competitor> getActiveCompetitors() {
		return activeCompetitors;
	}

	public void setActiveCompetitors(ArrayList<Competitor> activeCompetitors) {
		this.activeCompetitors = activeCompetitors;
	}

	public ArrayList<Competitor> getFinishedCompetitors() {
		return finishedCompetitors;
	}

	public void setFinishedCompetitors(ArrayList<Competitor> finishedCompetitors) {
		this.finishedCompetitors = finishedCompetitors;
	}

}
