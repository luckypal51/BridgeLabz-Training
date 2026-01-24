package Tree.MusicApp;

public class Main {
	 public static void main(String[] args) {
	        MusicLibrary library = new MusicLibrary();

	        library.insert(105, "Believer", "Lucky");
	        library.insert(101, "Alone", "Nageshwar");
	        library.insert(110, "Closer", "Himesh");
	        library.insert(103, "Faded", "rajeev");

	        
	        int searchId = 103;
	        Song result = library.search(searchId);

	        if (result != null) {
	            System.out.println("Track Found: " + result);
	        } else {
	            System.out.println("Track Not Found!");
	        }

	        
	        library.showPlaylist();
	    }
}
