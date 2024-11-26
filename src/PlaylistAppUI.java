import java.util.*;

public class PlaylistAppUI {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Playlist app " +
                "Press enter to get started");
        scanner.nextLine();

        System.out.print("Starting application");
        for (int i = 0; i < 6; i++) {
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println("\nApplication started");
        while(true) {
            System.out.println("\nMenu:");
            Thread.sleep(500);
            System.out.println("1. Create a new genre");
            Thread.sleep(400);
            System.out.println("2. Add a song to a genre");
            Thread.sleep(300);
            System.out.println("3. View all genres and songs");
            Thread.sleep(275);
            System.out.println("4. Create a playlist");
            Thread.sleep(250);
            System.out.println("5. Display playlist");
            Thread.sleep(240);
            System.out.println("6. Shuffle playlist");
            Thread.sleep(235);
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

        }
    }
}