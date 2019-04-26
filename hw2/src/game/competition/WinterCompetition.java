package game.competition;

import game.arena.WinterArena;
import game.entities.sportsman.WinterSportsman;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;

public abstract class WinterCompetition extends Competition{

	private Discipline discipline;
	private League league;
	private Gender gender;
	
	public WinterCompetition(WinterArena arena,int maxCompetitors, Discipline discipline, League league, Gender gender) {
		super(arena, maxCompetitors);
		this.setDiscipline(discipline);
		this.setLeague(league);
		this.setGender(gender);
	}
	
	@Override
	public boolean isValidCompetitor(Competitor competitor) {
		return (((WinterSportsman)competitor).getGender() == this.getGender()) && (this.getLeague().isInLeague(((WinterSportsman)competitor).getAge()))
				&& ((WinterSportsman)competitor).getDiscipline() == this.getDiscipline();
	}

	@Override
	public void addCompetitor(Competitor competitor) {
		if(getActiveCompetitors().size() >= getMaxCompetitors()) {
			throw new IllegalStateException(getArena() + " is full max = " + getMaxCompetitors());
		} 
		else 
			if(isValidCompetitor(competitor)) {
				competitor.initRace();
				this.getActiveCompetitors().add(competitor);
			} else throw new IllegalArgumentException("Invalid competitor " + competitor);

		
	}
	
	public Discipline getDiscipline() {
		return discipline;
	}
	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	public League getLeague() {
		return league;
	}
	public void setLeague(League league) {
		this.league = league;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
