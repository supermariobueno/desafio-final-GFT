package one.digitalinnovation.strategy;

import javax.swing.*;

public class Androide {

    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover(){
        Comportamento.mover();
    }
}
