import java.util.ArrayList;

public class ProgramRunner {

	private static ArrayList<Program> tVShows = new ArrayList<Program>();
	private static ArrayList<String> test = new ArrayList<String>();
	
	public static void main(String[] args) {

		createArrayList();
		printList();
		
		
		test.add("Hello");
		test.add("world");
		System.out.println(test.get(0) + test.get(1));
		
		
		
	}
	
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
	}
	
	private static void printList() {
		for (int i = 0; i < tVShows.size(); i++) {
			System.out.println("\n\n\n\nShow #" + (i+1) + " -- Title: " + tVShows.get(i).getTitle() + "\tGenre: " + tVShows.get(i).getGenre() + "\tSeasons aired: " + tVShows.get(i).getNumberOfSeasonsAired());
		}
	}

}
