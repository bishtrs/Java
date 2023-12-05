package dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Movie implements Subject {
	
	private List<Platform> platforms = new ArrayList<>();
	private String movieName;
	private String lastDate;

	@Override
	public void registerPlatform(Platform platform) {
		platforms.add(platform);
	}

	@Override
	public void removePlatform(Platform platform) {
		platforms.remove(platform);

	}

	@Override
	public void notifyPlatforms() {
		for (Platform platform : platforms) {
			platform.update(this);
		}
	}

	@Override
	public String getMovieName() {
		return movieName;
	}

	@Override
	public String getMovieLastDate() {
		return lastDate;
	}

	public void updateMovie(String movieName, String lastDate) {
		this.movieName = movieName;
		this.lastDate = lastDate;
		notifyPlatforms();
	}

}
