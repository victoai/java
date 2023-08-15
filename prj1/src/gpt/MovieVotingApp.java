package gpt;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Movie {
    private String title;
    private int votes;

    public Movie(String title) {
        this.title = title;
        this.votes = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getVotes() {
        return votes;
    }

    public void vote() {
        votes++;
    }
}

public class MovieVotingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Movie 1"));
        movies.add(new Movie("Movie 2"));
        // 추가적인 영화 정보를 이곳에 추가

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

        System.out.println("=== Results ===");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + ": " + movie.getVotes() + " votes");
        }

        scanner.close();
    }
}
