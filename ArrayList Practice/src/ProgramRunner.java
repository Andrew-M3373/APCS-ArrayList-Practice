import java.util.ArrayList;

public class ProgramRunner {

<<<<<<< HEAD
	private static ArrayList<Program> tVShows = new ArrayList<Program>();
	private static ArrayList<String> test = new ArrayList<String>();
=======
	static ArrayList<Program> TVShows = new ArrayList<Program>();
>>>>>>> branch 'master' of https://github.com/Andrew-M3373/APCS-ArrayList-Practice.git
	
	public static void main(String[] args) {

		createArrayList();
		printList();
		addYear();
		printList();
		deleteLongestTitle();
		printList();
		changeTitle();
		printList();
		
		
		test.add("Hello");
		test.add("world");
		System.out.println(test.get(0) + test.get(1));
		
		
		
	}
	
<<<<<<< HEAD
	private static void createArrayList() {
//		tVShows = new ArrayList<Program>() { {
//			add(new Program("Star Wars: The Clone Wars", "Science Fiction", 7));
//			add(new Program("The Mandalorian", "Science Fiction", 2));
//		}
//		};
		
		
		
		tVShows.add(0, new Program("Star Wars: The Clone Wars", "Science Fiction", 7));
		System.out.println(tVShows.get(0).getTitle());
		
		
		tVShows.add(1,new Program("The Mandalorian", "Science Fiction", 2));
		System.out.println(tVShows.get(0).getTitle());
		System.out.println(tVShows.get(1).getTitle());

//		TVShows.add(new Program("Star Wars: Rebels", "Science Fiction", 4));
//		TVShows.add(new Program("Star Wars: The Bad Batch", "Science Fiction", 1));
//		TVShows.add(new Program("Disney Gallery: Star Wars: The Mandalorian", "Documentary", 2));
=======
	public static void createArrayList() {
		TVShows.add(new Program("Star Wars: The Clone Wars", "Science Fiction", 12));
		TVShows.add(new Program("The Mandalorian", "Science Fiction", 2));
		TVShows.add(new Program("Disney Gallery: Star Wars: The Mandalorian", "Documentary", 2));
		TVShows.add(new Program("Star Wars: Rebels", "Science Fiction", 4));
		TVShows.add(new Program("Star Wars: The Bad Batch", "Science Fiction", 1));
>>>>>>> branch 'master' of https://github.com/Andrew-M3373/APCS-ArrayList-Practice.git
	}
	
<<<<<<< HEAD
	private static void printList() {
		for (int i = 0; i < tVShows.size(); i++) {
			System.out.println("\n\n\n\nShow #" + (i+1) + " -- Title: " + tVShows.get(i).getTitle() + "\tGenre: " + tVShows.get(i).getGenre() + "\tSeasons aired: " + tVShows.get(i).getNumberOfSeasonsAired());
=======
	public static void printList() {
		for (int i = 0; i < TVShows.size(); i++) {
			System.out.println("Show #" + (i+1) + " -- Title: " + TVShows.get(i).getTitle() + "\tGenre: " + TVShows.get(i).getGenre() + "\tSeasons aired: " + TVShows.get(i).getNumberOfSeasonsAired());
>>>>>>> branch 'master' of https://github.com/Andrew-M3373/APCS-ArrayList-Practice.git
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
