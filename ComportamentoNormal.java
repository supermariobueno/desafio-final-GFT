package one.digitalinnovation.strategy;

import java.sql.SQLOutput;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover(){
        System.out.println("Mover-se de forma normal");
    }

}
