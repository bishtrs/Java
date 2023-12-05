package dp.behavioral.observer;

public interface Subject {

	void registerPlatform(Platform platform);

	void removePlatform(Platform platform);

	void notifyPlatforms();

	String getMovieName();

	String getMovieLastDate();

}
