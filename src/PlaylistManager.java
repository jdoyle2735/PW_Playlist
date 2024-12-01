import java.util.ArrayList;
import java.util.Random;

public class PlaylistManager {
    private ArrayList<String> playlist;

    public PlaylistManager() {
        playlist = new ArrayList<>();
    }

    public void createPlaylist(ArrayList<String> songs) {
        playlist.clear();
        playlist.addAll(songs);
        System.out.println("Playlist created successfully.");
    }

    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (String song : playlist) {
                System.out.println("- " + song);
            }
        }
    }

    public void shufflePlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            Random rand = new Random();
            for (int i = playlist.size() - 1; i > 0; i--) {
                int randomIndex = rand.nextInt(i + 1);
                String temp = playlist.get(i);
                playlist.set(i, playlist.get(randomIndex));
                playlist.set(randomIndex, temp);
            }
            System.out.println("Playlist shuffled.");
        }
    }
}