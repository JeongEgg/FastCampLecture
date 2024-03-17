package part4.ch2;

import part4.ch2.model2.Movie;

import java.util.ArrayList;

public class MovieListExample {
    // 2
    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();

        Movie movie1 = new Movie("괴물","봉준호",2006,"한국");
        movieList.add(movie1);
        Movie movie2 = new Movie("기생충","봉준호",2019,"한국");
        movieList.add(movie2);
        Movie movie3 = new Movie("완벽한 타인","이재규",2018,"한국");
        movieList.add(movie3);
        for (Movie m : movieList){
            System.out.println(m);
        }

        System.out.println("+-----------------+----------+----+-------+");
        System.out.println("|영화감독           |감독      |개봉년도|국가|");
        System.out.println("+-----------------+----------+----+-------+");
        for (Movie m : movieList){
            System.out.printf("|%-16s|%-8s|%4s|%-6s|\n",m.getTitle(),m.getDirector(),m.getYear(),m.getCountry());
        }
        System.out.println("+-----------------+----------+----+-------+");

        String searchTitle = "기생충";
        for (Movie m : movieList){
            if (m.getTitle().equals(searchTitle)){
                System.out.println(m);
                break;
            }
        }
    }
}
