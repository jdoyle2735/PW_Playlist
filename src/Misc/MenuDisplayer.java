package Misc;

public class MenuDisplayer {

    // Enum-like values for colours

    private static final String GREEN = "\033[92m";
    private static final String RESET = "\033[0m";

    // Totally unnecessary ASCII art (as an array to display each line separately)

    private static final String[] ASCII_ART = {

        "    ██████╗ ███████╗████████╗██████╗  ██████╗     ███████╗██╗   ██╗███╗   ██╗████████╗██╗  ██╗ █████╗ ██████╗  █████╗",
        "    ██╔══██╗██╔════╝╚══██╔══╝██╔══██╗██╔═══██╗    ██╔════╝╚██╗ ██╔╝████╗  ██║╚══██╔══╝██║  ██║██╔══██╗██╔══██╗██╔══██╗",
        "    ██████╔╝█████╗     ██║   ██████╔╝██║   ██║    ███████╗ ╚████╔╝ ██╔██╗ ██║   ██║   ███████║███████║██████╔╝███████║",
        "    ██╔══██╗██╔══╝     ██║   ██╔══██╗██║   ██║    ╚════██║  ╚██╔╝  ██║╚██╗██║   ██║   ██╔══██║██╔══██║██╔══██╗██╔══██║",
        "    ██║  ██║███████╗   ██║   ██║  ██║╚██████╔╝    ███████║   ██║   ██║ ╚████║   ██║   ██║  ██║██║  ██║██║  ██║██║  ██║",
        "    ╚═╝  ╚═╝╚══════╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝     ╚══════╝   ╚═╝   ╚═╝  ╚═══╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝"

    };

    // Something of a menu

    private static final String[] MENU = {

            "╔════════════════════════════════════╗",
            "║             MAIN MENU              ║",
            "╠════════════════════════════════════╣",
            "║ 1. Create a new genre              ║",
            "║ 2. Add a song to a genre           ║",
            "║ 3. View all genres and songs       ║",
            "║ 4. Create a playlist               ║",
            "║ 5. Display playlist                ║",
            "║ 6. Shuffle playlist                ║",
            "║ 7. Add Genre to Playlist           ║",
            "║ 8. Exit                            ║",
            "╚════════════════════════════════════╝"

    };

    public void displayLogo(boolean sleep) {

        for (String line : ASCII_ART) {

            System.out.println(GREEN + line + RESET);

            if (sleep) sleep(100);

        }

    }

    public void displayMenu(boolean sleep) {

        for (String line : MENU) {

            System.out.println(GREEN + line + RESET);

            if (sleep) sleep(100);

        }

    }

    // Helper function to sleep for a given number of milliseconds

    public static void sleep(int ms) {

        try {

            Thread.sleep(ms);

        } catch (Exception e) {

            // (the joys of concurrency)

        }

    }

}
