package Java2_02;

import java.util.ArrayList;

public class MovieList {
    private ArrayList<String> movieList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("    Movie List ");
        System.out.println("-----------------");

        MovieList list = new MovieList();
        list.addMovie("");
        list.displayList();
        list.updateMovie(4,"House of Wax");
        list.removeMovie(3);
        list.findMove("9");

    }

    public void addMovie(String movie){
        movieList.add("The House In The Wood");
        movieList.add("Finding Nemo");
        movieList.add("Spririted Away");
        movieList.add("Catch me if you can");
        movieList.add("9");
        System.out.println(movieList);
    }
    public void displayList(){
        System.out.println("You have " + movieList.size() + " item in list");
        for (int i = 0;i < movieList.size();i++){
            System.out.println("Movie  " + (i + 1) + "  " + movieList.get(i));
        }
    }
    public void updateMovie(int index, String movie){
        movieList.set(index,movie);
        System.out.println("Updated ");
        System.out.println("Movie  " + (index + 1) + " " + movie);
    }
    public void removeMovie(int index){
        String movie = movieList.get(index);
        movieList.remove(index);
        System.out.println("Removed " + movie);
    }
    public String findMove(String search){
        int position = movieList.indexOf(search);
        if (position > 0 ){
            return movieList.get(position);
        }
        return  null;
    }
}
