package br.eng.corsini.adivinho;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Oraculo {
    private Calendar fimMundo = new GregorianCalendar(2012, 11, 22);
    private boolean hojeChove = false;
    //construtor privado
    private Oraculo(){}
    //atributo estatico reflexivo
    private static Oraculo instancia = new Oraculo();
    //metodo estatico para instancia
    public static Oraculo getInstancia(){
        return instancia;
    }
    public Calendar getFimMundo() {
        return fimMundo;
    }
    public void setFimMundo(Calendar fimMundo) {
        this.fimMundo = fimMundo;
    }
    public boolean isHojeChove() {
        return hojeChove;
    }
    public void setHojeChove(boolean hojeChove) {
        this.hojeChove = hojeChove;
    }
    public static void setInstancia(Oraculo instancia) {
        Oraculo.instancia = instancia;
    }
}
