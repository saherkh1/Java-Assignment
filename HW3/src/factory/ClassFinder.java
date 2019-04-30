package factory;

import java.util.List;

public class ClassFinder {
	private static String GAME_PACKAGE = "game";
	private static String GAME_PACKAGE_DIR = "src/game";
	private static ClassFinder instance;

	public static ClassFinder getInstance() {
		if (instance == null) {
			instance = new ClassFinder();
		}
		return instance;
	}

	//private List<Class<?>> classList;
	//private List<Class<?>> racersList;
	//private List<Class<?>> arenasList;

}
