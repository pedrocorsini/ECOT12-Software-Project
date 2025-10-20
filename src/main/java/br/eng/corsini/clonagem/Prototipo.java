package br.eng.corsini.clonagem;

public interface Prototipo<T extends Prototipo<T>> {
    public T clone();
}
