package dp.behavioral.observer;

// Observer design pattern java example
public class ObserverTest {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.registerPlatform(new TV());
		movie.registerPlatform(new Mobile());
		movie.updateMovie("Evil Dead", "11/11/2025");
		//movie.removePlatform(platform);
	}

}
