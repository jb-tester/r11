package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/15/2018.
 * Project: multiple_github_repos
 */
public class MySingleton {
    private static MySingleton ourInstance = new MySingleton();

    public static MySingleton getInstance() {
        return ourInstance;
    }

    private MySingleton() {
    }
}
