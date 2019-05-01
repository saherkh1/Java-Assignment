package factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import game.arena.WinterArena;
import game.competition.Competition;
import game.competition.Competitor;
import game.competition.WinterCompetition;
import game.entities.sportsman.Sportsman;
import game.entities.sportsman.WinterSportsman;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;
import game.enums.SnowSurface;
import game.enums.WeatherCondition;



public class CompBuilder {
	private static CompBuilder instance;
	private ClassLoader classLoader;
	private Class<?> classObject;
	private Constructor<?> constructor;

	public static CompBuilder getInstance() {
		if (instance == null) {
			instance = new CompBuilder();
		}
		return instance;
	}
	
	
	private CompBuilder() {
		classLoader = ClassLoader.getSystemClassLoader();
	}
	


	
    
	public WinterSportsman buildSportsman(String racerType, String name,double age,Gender gender , double acceleration,double maxSpeed,Discipline discipline)
		throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
		IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			this.classObject = classLoader.loadClass(racerType);
			this.constructor = classObject.getConstructor(String.class, double.class,Gender.class ,double.class,double.class,Discipline.class);
			return (WinterSportsman) this.constructor.newInstance(name, age,gender, acceleration, maxSpeed, discipline);

	}
	//WinterCompetition(WinterArena arena, int maxCompetitors, Discipline discipline, League league, Gender gender)
	public WinterCompetition buildCompetition(String competitionType,WinterArena arena, int maxCompetitors, Discipline discipline, League league, Gender gender)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				this.classObject = classLoader.loadClass(competitionType);
				this.constructor = classObject.getConstructor(WinterArena.class, int.class,Discipline.class ,League.class,Gender.class);
				return (WinterCompetition) this.constructor.newInstance(  arena,  maxCompetitors,  discipline,  league,  gender);
		}
	
	public WinterArena buildArena(String ArenaType,double len, SnowSurface surface,WeatherCondition condetion)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				this.classObject = classLoader.loadClass(ArenaType);
				this.constructor = classObject.getConstructor(double.class, SnowSurface.class,WeatherCondition.class);
				return (WinterArena) this.constructor.newInstance( len,  surface, condetion);
		}
}
