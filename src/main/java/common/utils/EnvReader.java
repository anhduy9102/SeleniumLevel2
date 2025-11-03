package common.utils;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvReader {
    private static final Dotenv dotenv = Dotenv.configure()
            .directory("src/main/resources")
            .ignoreIfMissing()
            .load();

    public static String get(String key) {
        return dotenv.get(key);
    }
}
