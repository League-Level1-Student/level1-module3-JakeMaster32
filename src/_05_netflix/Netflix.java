package _05_netflix;

public class Netflix {
	static Movie WinterSoldier = new Movie("Captain America: Winter Soldier", 90);
	static Movie CivilWar = new Movie("Captain America: Civil War", 91);
	static Movie InfinityWar = new Movie("Avengers Infinity War", 85);
	static Movie Endgame = new Movie("Avengers Endgame", 94);
	static Movie FarFromHome = new Movie("Spiderman Far From Home", 90);
	static NetflixQueue netflix = new NetflixQueue();

	public static void main(String[] args) {
		System.out.println(WinterSoldier.getTicketPrice());
		netflix.addMovie(WinterSoldier);
		netflix.addMovie(CivilWar);
		netflix.addMovie(InfinityWar);
		netflix.addMovie(Endgame);
		netflix.addMovie(FarFromHome);
	netflix.printMovies();
	netflix.sortMoviesByRating();
	System.out.println(netflix.getMovie(0));
	System.out.println(netflix.getMovie(1));
	System.out.println(netflix.getMovie(2));
	System.out.println(netflix.getMovie(3));
	System.out.println(netflix.getMovie(4));
	}
}
