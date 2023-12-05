package dp.behavioral.observer;

public class TV implements Platform {

	@Override
	public void update(Subject subject) {
		System.out.println("Got update for movie " + subject.getMovieName());
		System.out.println("Movie last date on this platform is " + subject.getMovieLastDate());
	}

}
