package gpt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
 

public class MovieVotingApp2 {
	
	Scanner scanner = new Scanner(System.in);
	List<Movie> movies = new ArrayList<>();
	
	
	
	public void run(){
		
		register();
		
		while (true) {
			System.out.println("=== Movie Voting App ===");
			for (int i = 0; i < movies.size(); i++) {
				System.out.println((i + 1) + ". " + movies.get(i).getTitle());
			}
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			
			int choice = scanner.nextInt();
			if (choice == 0) {
				System.out.println("Exiting the app.");
				break;
			} else if (choice > 0 && choice <= movies.size()) {
				Movie selectedMovie = movies.get(choice - 1);
				selectedMovie.vote();
				System.out.println("You voted for " + selectedMovie.getTitle());
			} else {
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}
		
		sortMovie();
		showMovie();
		scanner.close();
		
	}
	
	
	
    public static void main(String[] args) {
    	MovieVotingApp2  m  = new MovieVotingApp2();
    	m.run();
    }
    
    
    
	public   void showMovie() {
		System.out.println("=== Results ===");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + ": " + movie.getVotes() + " votes");
        }
	}

	public   void register() {
		movies.add(new Movie("Movie 1"));
        movies.add(new Movie("Movie 2"));
        // 추가적인 영화 정보를 이곳에 추가
	}
	
	
	//정렬하기 
	public void sortMovie(){
		
		Collections.sort(movies , new Comparator<Movie>(){
			@Override
			public int compare(Movie o1, Movie o2) {
				//return o1.getVotes()-o2.getVotes();
				return o2.getVotes()-o1.getVotes();
			}});
		
	}
}
