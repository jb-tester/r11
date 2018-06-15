package a.b.c;

/**
 * *******************************
 * Created by irina on 5/15/2018.
 * Project: multiple_github_repos
 * <p>
 * <p>
 * *******************************
 */
public class SSS_singleton {

    private static SSS_singleton ourInstance = new SSS_singleton();

    private SSS_singleton() {
    }

    public static SSS_singleton getInstance() {
        return ourInstance;
    }
}
