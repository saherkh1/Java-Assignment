package game.entities.sportsman;

import game.competition.Competitor;
import game.entities.IMobileEntity;
import game.enums.Discipline;
import game.enums.Gender;
import utilities.Point;;

public class WinterSportsman extends Sportsman implements Competitor,IMobileEntity {
	
	private Discipline discipline;
	
	public WinterSportsman(String name, double age, Gender gender, double acceleration, double maxSpeed, Discipline discipline) {
		super(name, age, gender, maxSpeed, acceleration);
		this.setDiscipline(discipline);
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}



	@Override
	public void move(double friction) {
/*		if(this.getSpeed()<this.getMaxSpeed()) {
			double s=(this.getSpeed()+this.getAcceleration()*friction);
			if(s>this.getMaxSpeed())
				this.setSpeed(getMaxSpeed());
			else
				this.setSpeed(s);
		}*/
		setSpeed(getSpeed() + (getAcceleration() * (1 - friction)));
		setLocation(new Point(getLocation().getX() + getSpeed(), getLocation().getY()));
	
	}



	@Override
	public Point getLoction() {
		return super.getLocation();
	}



	@Override
	public void initRace() {
		this.setLocation(new Point());
		
	}
	
	
}
