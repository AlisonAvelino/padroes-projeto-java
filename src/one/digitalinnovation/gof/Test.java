package one.digitalinnovation.gof;

public class Test {
    public static void main(String[] args) {

        //Testes relaciodos ao Design Pattern Sigleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        //Verificando a nova instancia
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        //Verificando a nova instancia
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        //Verificando a nova instancia
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

    }
}
