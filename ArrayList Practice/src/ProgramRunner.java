import java.util.ArrayList;

public class ProgramRunner {

	private static ArrayList<Program> TVShows = new ArrayList<Program>();
	
	public static void main(String[] args) {

		createArrayList();
		printList();
		
		
		
	}
	
	private static void createArrayList() {
		TVShows.add(new Program("Star Wars: The Clone Wars", "Science Fiction", 12));
		TVShows.add(new Program("The Mandalorian", "Science Fiction", 2));
		TVShows.add(new Program("Star Wars: Rebels", "Science Fiction", 4));
		TVShows.add(new Program("Star Wars: The Bad Batch", "Science Fiction", 1));
		TVShows.add(new Program("Disney Gallery: Star Wars: The Mandalorian", "Documentary", 2));
	}
	
	private static void printList() {
		for (int i = 0; i < TVShows.size(); i++) {
			System.out.println("Show #" + (i+1) + " -- Title: " + TVShows.get(i).getTitle() + "\tGenre: " + TVShows.get(i).getGenre() + "\tSeasons aired: " + TVShows.get(i).getNumberOfSeasonsAired());
		}
	}

}
