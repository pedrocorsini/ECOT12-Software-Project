package br.eng.corsini.thor;

public class Main {
    public static void main(String[] args) {
//O deus Thor é uma divindade masculina, 
//designado deus do trovão; sua fraqueza 
//é se tornar não digno, e mora 
//na cidade de Nova York do reino de Midgard. 
// Thor detém vários poderes: 
// tecido sobre-humanamente denso;  
        Reino r = new Reino();
        r.setNome("Midgard");

        Cidade c = new Cidade(r);
        c.setNome("Nova York");
        c.setReino(r);

        Deus t = new Deus();
        t.setNome("Thor");
        t.setSexo("masculino");
        t.setDesignacao("deus do trovão");
        t.setFraqueza("tornar-se não digno");
        t.setMora(c);

        System.out.println("Nome do Deus: " + t.getNome());
        System.out.println("Sexo: " + t.getSexo());
        System.out.println("Designação: " + t.getDesignacao());
        System.out.println("Fraqueza: " + t.getFraqueza());
        System.out.println("Cidade onde mora: " + t.getMora().getNome());
        System.out.println("Reino da cidade: " + t.getMora().getReino().getNome());

    }
}