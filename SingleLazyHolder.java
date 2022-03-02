package one.digitalinnovation.singleton;

/**
 * Lazy holder singleton
 * @autor Supermario_bueno
 */

public class SingleLazyHolder {

    private static class InstanceHolder {
        public static SingleLazyHolder instancia = new SingleLazyHolder();
    }

    private SingleLazyHolder() {
        super();
    }

    public static SingleLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}


