package Collectors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Genres {

    private HashMap<String, ArrayList<String>> genresWithSongs;

    public Genres() {

        genresWithSongs = new HashMap<>();

    }

    public void createGenre(String genre) {

        if (!genresWithSongs.containsKey(genre)) {

            genresWithSongs.put(genre, new ArrayList<>());
            System.out.println("Genre '" + genre + "' created successfully.");

        } else {

            System.out.println("Genre '" + genre + "' already exists.");

        }

    }

    public void addSongToGenre(String genre, String song) {

        if (genresWithSongs.containsKey(genre)) {

            genresWithSongs.get(genre).add(song);
            System.out.println("Song '" + song + "' added to genre '" + genre + "'.");

        } else {

            System.out.println("Genre '" + genre + "' doesn't exist.");

        }

    }

    public void viewGenresAndSongs() {

        if (genresWithSongs.isEmpty()) {

            System.out.println("No genres available.");

        } else {

            for (Map.Entry<String, ArrayList<String>> entry : genresWithSongs.entrySet()) {

                System.out.println("Genre: " + entry.getKey());
                System.out.println("Songs: " + entry.getValue());

            }

        }

    }

    public ArrayList<String> getSongsForGenre(String genre) {

        return genresWithSongs.getOrDefault(genre, new ArrayList<>());

    }

}
