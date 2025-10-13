package br.eng.corsini.lab08.gourmet;

public class Main {
    public static void main(String[] args) {
        Receita r = new Receita();
        r.setNome("angu");
        r.setPrimeiroPasso(new Cozinhar(1, "litro", "agua", "panela")).
        setEmSeguida(new Mexer(0.5f, "kg", "fuba", 10)).
        setEmSeguida(new Mexer(1, "litro", "agua", 15)).
        setEmSeguida(new Outro("colocar", 1, "colher", "sal"));
        System.out.println("r="+r.getPrimeiroPasso().quantosPassos()); }
} 