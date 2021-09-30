import java.util.ArrayList;

public class ProgramRunner {

	static ArrayList<Program> TVShows = new ArrayList<Program>();
	
	public static void main(String[] args) {

		createArrayList();
		printList();
		addYear();
		printList();
		deleteLongestTitle();
		printList();
		changeTitle();
		printList();
		
		
		
	}
	
	public static void createArrayList() {
		TVShows.add(new Program("Star Wars: The Clone Wars", "Science Fiction", 12));
		TVShows.add(new Program("The Mandalorian", "Science Fiction", 2));
		TVShows.add(new Program("Disney Gallery: Star Wars: The Mandalorian", "Documentary", 2));
		TVShows.add(new Program("Star Wars: Rebels", "Science Fiction", 4));
		TVShows.add(new Program("Star Wars: The Bad Batch", "Science Fiction", 1));
	}
	
	public static void printList() {
		for (int i = 0; i < TVShows.size(); i++) {
			System.out.println("Show #" + (i+1) + " -- Title: " + TVShows.get(i).getTitle() + "\tGenre: " + TVShows.get(i).getGenre() + "\tSeasons aired: " + TVShows.get(i).getNumberOfSeasonsAired());
		}
		System.out.println("\n\n");
	}
	
	public static void addYear() {
		for (int i = 0; i < TVShows.size(); i ++) {
			TVShows.get(i).setNumberOfSeasonsAired(TVShows.get(i).getNumberOfSeasonsAired()+1);
		}
	}
	
	public static void deleteLongestTitle() {
		int longestTitleIndex = 0;
		for (int i = 0; i < TVShows.size(); i++) {
			if (TVShows.get(i).getTitle().length() > TVShows.get(longestTitleIndex).getTitle().length()) {
				longestTitleIndex = i;
			}
		}
		
		TVShows.remove(longestTitleIndex);
	}
	
	public static void changeTitle() {
		TVShows.get(0).setTitle("Other Title!!");
	}

}
