package br.eng.corsini.clonagem;

public interface Igualdade<T extends Igualdade<T>>{
    public boolean isEqual(T obj);
}
