import Collectors.Genres;
import Collectors.Playlist;
import Misc.MenuDisplayer;

import java.util.ArrayList;
import java.util.Scanner;

public class Interactions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MenuDisplayer menuDisplayer = new MenuDisplayer(); // This classes methods could also admittedly be static to avoid instantiation

        Genres genreSongManager = new Genres();
        Playlist globalPlaylist = new Playlist();

        menuDisplayer.displayLogo(true);
        menuDisplayer.displayMenu(true);

        while (true) {

            int choice = getValidChoice(scanner);

            switch (choice) {

                case 1: {

                    System.out.print("Enter genre name: ");

                    String genre = scanner.nextLine().trim();

                    if (genre.isEmpty()) {

                        System.out.println("Genre name cannot be empty. Try again.");

                    } else {

                        genreSongManager.createGenre(genre);

                    }

                    break;

                }

                case 2: {

                    System.out.print("Enter genre name: ");

                    String genre = scanner.nextLine().trim();

                    if (genre.isEmpty()) {

                        System.out.println("Genre name cannot be empty. Try again.");
                        break;

                    }

                    System.out.print("Enter song name: ");
                    String song = scanner.nextLine().trim();

                    if (song.isEmpty()) {

                        System.out.println("Song name cannot be empty. Try again.");

                    } else {

                        genreSongManager.addSongToGenre(genre, song);

                    }

                    break;

                }

                case 3: {

                    genreSongManager.viewGenresAndSongs();
                    break;

                }

                case 4: {

                    System.out.print("Enter genre to create playlist: ");

                    String genre = scanner.nextLine().trim();

                    if (genre.isEmpty()) {

                        System.out.println("Genre name cannot be empty. Try again.");
                        break;

                    }

                    ArrayList<String> songs = genreSongManager.getSongsForGenre(genre);

                    if (songs.isEmpty()) {

                        System.out.println("No songs available in this genre.");

                    } else {

                        globalPlaylist.create(songs);

                    }

                    break;

                }
                case 5: {

                    globalPlaylist.display();
                    break;

                }
                case 6: {

                    globalPlaylist.shuffle();
                    break;

                }

                case 7: {

                    System.out.print("Enter genre to add to playlist: ");

                    String genre = scanner.nextLine().trim();

                    if (genre.isEmpty()) {

                        System.out.println("Genre name cannot be empty. Try again.");
                        break;

                    }

                    ArrayList<String> songs = genreSongManager.getSongsForGenre(genre);

                    if (songs.isEmpty()) {

                        System.out.println("No songs available in this genre.");

                    } else {

                        globalPlaylist.bulkAdd(songs);

                    }

                    break;

                }

                case 8: {

                    System.out.println("Exiting...");

                    scanner.close();
                    return;

                }


                default: {

                    System.out.println("Invalid choice. Please try again.");

                }

            }

        }

    }

    // This is a helper function to check user input for the generic menu choice (1-8)

    private static int getValidChoice(Scanner scanner) {

        int choice = 0;

        while (true) {

            try {

                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice >= 1 && choice <= 8) {

                    break;

                } else {

                    System.out.println("Invalid choice. Please choose between 1 and 8.");

                }

            } catch (Exception e) {

                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();

            }

        }

        return choice;

    }

}