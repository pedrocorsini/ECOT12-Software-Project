package br.eng.corsini.spider;

public class Main {
    public static void main(String[] args) {
        TransformacaoAranha t = new TransformacaoAranha();
        Evento e = t.piacada("cindy", "silk");
        System.out.println(e.getSeres().get(0).getNome());
        
    }
}