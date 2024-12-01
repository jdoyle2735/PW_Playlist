import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GenreSongManager {
    private HashMap<String, ArrayList<String>> genreSongMap;

    public GenreSongManager() {
        genreSongMap = new HashMap<>();
    }

    public void createGenre(String genre) {
        if (!genreSongMap.containsKey(genre)) {
            genreSongMap.put(genre, new ArrayList<>());
            System.out.println("Genre '" + genre + "' created successfully.");
        } else {
            System.out.println("Genre '" + genre + "' already exists.");
        }
    }

    public void addSongToGenre(String genre, String song) {
        if (genreSongMap.containsKey(genre)) {
            genreSongMap.get(genre).add(song);
            System.out.println("Song '" + song + "' added to genre '" + genre + "'.");
        } else {
            System.out.println("Genre '" + genre + "' doesn't exist.");
        }
    }

    public void viewGenresAndSongs() {
        if (genreSongMap.isEmpty()) {
            System.out.println("No genres available.");
        } else {
            for (Map.Entry<String, ArrayList<String>> entry : genreSongMap.entrySet()) {
                System.out.println("Genre: " + entry.getKey());
                System.out.println("Songs: " + entry.getValue());
            }
        }
    }

    public ArrayList<String> getSongsForGenre(String genre) {
        return genreSongMap.getOrDefault(genre, new ArrayList<>());
    }
}
