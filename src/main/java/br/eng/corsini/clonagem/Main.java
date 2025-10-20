package br.eng.corsini.clonagem;

public class Main {
    public static void main(String[] args) {
        Moto m1 = new Moto();
        m1.setMarca("Honda");
        m1.setCilindrada(450);
        Moto m2 = m1.clone();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1==m2);
        System.out.println(m1.isEqual(m2));
    
    }
}