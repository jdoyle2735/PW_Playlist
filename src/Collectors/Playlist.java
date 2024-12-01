package Collectors;

import java.util.ArrayList;
import java.util.Random;

public class Playlist {

    private final ArrayList<String> tracks;

    public Playlist() {

        tracks = new ArrayList<>();

    }

    public void create(ArrayList<String> songs) {

        this.tracks.clear();
        this.bulkAdd(songs);

        System.out.println("Playlist created successfully.");

    }

    public void bulkAdd(ArrayList<String> songs) {

        this.tracks.addAll(songs);

        System.out.println("Tracks added to playlist.");

    }

    public void display() {

        if (this.tracks.isEmpty()) {

            System.out.println("The playlist is empty.");

        } else {

            System.out.println("Tracks:");

            for (String track : this.tracks) {

                System.out.println("- " + track);

            }

        }

    }

    public void shuffle() {

        if (tracks.isEmpty()) {

            System.out.println("The playlist is empty.");

        } else {

            // This is the Fisher-Yates shuffle algorithm
            // https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle

            Random rand = new Random();

            for (int i = tracks.size() - 1; i > 0; i--) {

                int randomIndex = rand.nextInt(i + 1);
                String temp = tracks.get(i);
                tracks.set(i, tracks.get(randomIndex));
                tracks.set(randomIndex, temp);

            }

            System.out.println("Playlist shuffled.");

        }

    }

}