package com.eu.habbo.jarvis.eventloader;
import com.eu.habbo.plugin.EventListener;
import java.util.Scanner;
import static com.eu.habbo.Emulator.ANSI_BLUE;
import static com.eu.habbo.Emulator.ANSI_WHITE;

public class JarvisWebHookSetup implements EventListener {
    public static void  go() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("[" + ANSI_BLUE + "PLUGIN" + ANSI_WHITE + "] " + "---------------------------------");
        System.out.println("[" + ANSI_BLUE + "PLUGIN" + ANSI_WHITE + "] " + "Nice! Jarvis has installed to your database! Now it's time to add your discord webhooks! Make sure you've made all of the channels required on your discord, and have the webhook URL's to hand!");
        System.out.println("[" + ANSI_BLUE + "PLUGIN" + ANSI_WHITE + "] " + "---------------------------------");
        System.out.println("[" + ANSI_BLUE + "PLUGIN" + ANSI_WHITE + "] " + "Enter your Discord webhook URL for the Emulator Startup and Shutdown logs.");
        String startstopurl = scanner.nextLine();
        System.out.println("[" + ANSI_BLUE + "PLUGIN" + ANSI_WHITE + "] " + "Enter your Discord webhook URL for the User Login/ Logout Logs");
        String userloginandouturl = scanner.nextLine();
        System.out.println("[" + ANSI_BLUE + "PLUGIN" + ANSI_WHITE + "] " + "Enter your Discord webhook URL for the User Commands Logs");
        String usercommandsurl = scanner.nextLine();
        System.out.println("[" + ANSI_BLUE + "PLUGIN" + ANSI_WHITE + "] " + "Enter your Discord webhook URL for the Staff Commands Logs");
        String staffcommandsurl = scanner.nextLine();
        System.out.println("[" + ANSI_BLUE + "PLUGIN" + ANSI_WHITE + "] " + "Enter your Discord webhook URL for the User Catalogue Buying Logs");
        String userbuyscatalogueurl = scanner.nextLine();
        System.out.println("[" + ANSI_BLUE + "PLUGIN" + ANSI_WHITE + "] " + "Enter your Discord webhook URL for the Photograph Buying Logs");
        String userphotourl = scanner.nextLine();
        System.out.println("[" + ANSI_BLUE + "PLUGIN" + ANSI_WHITE + "] " + "Okay! All Done!");
        // it's 2am ill finish this bit tomorrow. night night.
        //  try (Connection connection = Emulator.getDatabase().getDataSource().getConnection(); PreparedStatement statement = connection.prepareStatement("")) {
        //     statement.setString(1, startstopurl);
        //    statement.setString(2, userloginandouturl);
        //    statement.execute();
        // } catch (SQLException e) {
        //     Emulator.getLogging().logSQLException(e);
        // }

        // All done.
    }
}