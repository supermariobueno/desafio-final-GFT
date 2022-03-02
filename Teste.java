package one.digitalinnovation;

import one.digitalinnovation.facade.Facade;
import one.digitalinnovation.strategy.Comportamento;
import one.digitalinnovation.strategy.ComportamentoAgressiv;
import one.digitalinnovation.strategy.ComportamentoDefensivo;
import one.digitalinnovation.strategy.ComportamentoNormal;

import java.awt.*;

public class Teste {

    public static void main(String[] args) throws AWTException {
        /* Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
         */

        /* Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal());
        Comportamento agressivo = new ComportamentoAgressiv();

        Robot robot = new Robot();
        robot.setComportamento(normal);
        
        robot.mover; */

        Facade facade = new Facade();
        facade.migrarCliente("Mario", "15975358");
    }
}
