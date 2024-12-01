import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PlaylistAppUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogoMenuDisplayed logoMenuDisplayer = new LogoMenuDisplayed();
        GenreSongManager genreSongManager = new GenreSongManager();
        PlaylistManager playlistManager = new PlaylistManager();

        logoMenuDisplayer.displayLogo();
        logoMenuDisplayer.displayMenu();

        while (true) {
            int choice = getValidChoice(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter genre name: ");
                    String genre = scanner.nextLine().trim();
                    if (genre.isEmpty()) {
                        System.out.println("Genre name cannot be empty. Try again.");
                    } else {
                        genreSongManager.createGenre(genre);
                    }
                    break;
                case 2:
                    System.out.print("Enter genre name: ");
                    genre = scanner.nextLine().trim();
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
                case 3:
                    genreSongManager.viewGenresAndSongs();
                    break;
                case 4:
                    System.out.print("Enter genre to create playlist: ");
                    genre = scanner.nextLine().trim();
                    if (genre.isEmpty()) {
                        System.out.println("Genre name cannot be empty. Try again.");
                        break;
                    }
                    ArrayList<String> songs = genreSongManager.getSongsForGenre(genre);
                    if (songs.isEmpty()) {
                        System.out.println("No songs available in this genre.");
                    } else {
                        playlistManager.createPlaylist(songs);
                    }
                    break;
                case 5:
                    playlistManager.displayPlaylist();
                    break;
                case 6:
                    playlistManager.shufflePlaylist();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int getValidChoice(Scanner scanner) {
        int choice = 0;
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice >= 1 && choice <= 7) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please choose between 1 and 7.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        return choice;
    }
}
