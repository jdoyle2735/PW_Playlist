import java.util.*;

public class PlaylistAppUI {
    public static void main(String[] args) throws InterruptedException {

        LogoMenuDisplayer art = new LogoMenuDisplayer();
        art.displayLogo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Retro Spotify!");
        System.out.println("Press Enter to get started...");
        scanner.nextLine();


        System.out.print("\033[96mInitializing");
        for (int i = 0; i < 6; i++) {
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println("\n\033[0mApplication started!");
        art.displayMenu();

        System.out.println("Please Select and Option: ");

        while (true) {
            int choice = scanner.nextInt();
            scanner.next();
        }
    }
}