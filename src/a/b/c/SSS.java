package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/15/2018.
 * Project: multiple_github_repos
 * <p>
 * <p>
 * *******************************
 */
public class SSS {

    private static SSS ourInstance = new SSS();

    private SSS() {
    }

    public static SSS getInstance() {
        return ourInstance;
    }
}
