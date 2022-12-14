package server.database;

public class DBSettings {
    final static String PASSWORD = "UXR726gp1HLHwKKI";
    final static String LOGIN = "s308478";
    final static String HOST = "pg";
    final static String PORT = "5432";
    final static String DEBUG_HOST = "localhost";
    final static String DEBUG_PORT = "1099";
    final static boolean DEBUG = false;

    static String url() {
        return "jdbc:postgresql://" + (DEBUG ? DEBUG_HOST : HOST)  +  ":"
                + (DEBUG ? DEBUG_PORT : PORT) + "/studs";
    }
}