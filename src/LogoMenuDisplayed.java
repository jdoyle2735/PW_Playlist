public class LogoMenuDisplayed {
    private static final String GREEN = "\033[92m";
    private static final String RESET = "\033[0m";

    private static final String[] ASCII_ART = {
            "██████  ███████ ████████ ██████   ██████      ███████ ██████   ██████  ████████ ██ ███████ ██    ██ ██",
            "██   ██ ██         ██    ██   ██ ██    ██     ██      ██   ██ ██    ██    ██    ██ ██       ██  ██  ██",
            "██████  █████      ██    ██████  ██    ██     ███████ ██████  ██    ██    ██    ██ █████     ████   ██",
            "██   ██ ██         ██    ██   ██ ██    ██          ██ ██      ██    ██    ██    ██ ██         ██       ",
            "██   ██ ███████    ██    ██   ██  ██████      ███████ ██       ██████     ██    ██ ██         ██    ██ ",
            "                                                                                                        "
    };

    private static final String[] MENU = {
            "╔════════════════════════════════════╗",
            "║          🎵 MAIN MENU 🎵           ║",
            "╠════════════════════════════════════╣",
            "║ 1. Create a new genre              ║",
            "║ 2. Add a song to a genre           ║",
            "║ 3. View all genres and songs       ║",
            "║ 4. Create a playlist               ║",
            "║ 5. Display playlist                ║",
            "║ 6. Shuffle playlist                ║",
            "║ 7. Exit                            ║",
            "╚════════════════════════════════════╝"
    };

    public void displayLogo() {
        for (String line : ASCII_ART) {
            System.out.println(GREEN + line + RESET);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }

    public void displayMenu() {
        for (String line : MENU) {
            System.out.println(GREEN + line + RESET);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }
}
