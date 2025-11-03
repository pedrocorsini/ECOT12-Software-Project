package br.eng.corsini.hulk;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("bruce");
        System.out.println(p.getNome());
        System.out.println(p.getEstado());
        p.setRaiva(0.9f);
        if(p.getEstado() instanceof Selvagem)
            ((Selvagem)p.getEstado()).setResistencia(120);
        System.out.println(p.getEstado());
    }
}
