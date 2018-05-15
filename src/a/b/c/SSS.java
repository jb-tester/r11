package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/15/2018.
 * Project: multiple_github_repos
 *
 *
 * *******************************
 */
public class SSS {
    private static SSS ourInstance = new SSS();

    public static SSS getInstance() {
        return ourInstance;
    }

    private SSS() {
    }
}
