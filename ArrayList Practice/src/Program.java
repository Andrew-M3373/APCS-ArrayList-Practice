
public class Program {
	
	private static String title;
	private static String genre;
	private static int numberOfSeasonsAired;
	
	public Program(String t, String g, int n) {
		title = t; 
		genre = g;
		numberOfSeasonsAired = n;
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		Program.title = title;
	}

	public static String getGenre() {
		return genre;
	}

	public static void setGenre(String genre) {
		Program.genre = genre;
	}

	public static int getNumberOfSeasonsAired() {
		return numberOfSeasonsAired;
	}

	public static void setNumberOfSeasonsAired(int numberOfSeasonsAired) {
		Program.numberOfSeasonsAired = numberOfSeasonsAired;
	}
	
	
}
