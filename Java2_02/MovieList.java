package Java2_02;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {

    private ArrayList<String> movieList = new ArrayList<>();

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("How many film do you like?");
//        int n = in.nextInt();
//
//        String[] movie = new String[n];
//
//        for(int i = 0; i < movie.length; i++){
//            System.out.println("Movie " + (i+1) + ":");
//            movie[i] = in.next();
//        }

        MovieList list = new MovieList();
        list.addMovie("1");
        list.addMovie("2");
        list.addMovie("3");
        list.addMovie("4");
        list.addMovie("5");

        list.displayList();
        list.addMovie("LTR");
        list.updateMovie(3,"Nope");
        list.removeMovie(5);
        list.findMovie("3");
    }

    public void addMovie(String movie){
        movieList.add(movie);
    }

    public void displayList(){
        System.out.println("You have " + movieList.size() + " items in favorite:");
        for(int i = 0; i < movieList.size(); i++){
            System.out.println("Movie " + (i+1) + " " + movieList.get(i));
        }
    }

    public void updateMovie(int index, String movie){
        movieList.set(index, movie);
        System.out.println("Updated");
        System.out.println("Movie " + (index + 1) + " " + movie);
    }

    public void removeMovie(int index){
        String movie = movieList.get(index);
        movieList.remove(index);
        System.out.println("Removed " + movie);
    }


    public String findMovie(String search){
        int position = movieList.indexOf(search);
        if(position > 0){
            return movieList.get(position);
        }
        return null;
    }
}
