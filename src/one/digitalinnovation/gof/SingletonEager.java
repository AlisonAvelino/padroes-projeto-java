package one.digitalinnovation.gof;

/**
 * Singleton "apressado"
 *
 * @author AlisonAvelino
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
