package chennai.surendhar;

public class Theatre {
    // Fields to store movie name and time
    public String movie_name;
    public double movie_time;

    // Main method
    public static void main(String[] args) {
        // Creating instances of Theatre class
        Theatre movie1 = new Theatre();
        Theatre movie2 = new Theatre();

        // Setting values for movie1
        movie1.movie_name = "Jailer";
        movie1.movie_time = 6.30;

        // Setting values for movie2
        movie2.movie_name = "Leo";
        movie2.movie_time = 7.30;

        // Calling methods on movie1
        movie1.watch_movie();
        movie1.timing();

        // Calling methods on movie2
        movie2.watch_movie();
        movie2.timing();
    }

    // Method to print which movie is being watched
    public void watch_movie() {
        System.out.println("watching " + movie_name);
    }

    // Method to print the timing of the movie
    public void timing() {
        System.out.println("Timing :" + movie_time);
    }
}
