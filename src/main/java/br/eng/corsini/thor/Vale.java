package br.eng.corsini.thor;

public class Vale extends Territorio {
    private boolean temFloresta;
    private boolean temRio;
    public Vale(Reino reino) {
        super(reino);
    }
    public boolean isTemFloresta() {
        return temFloresta;
    }
    public void setTemFloresta(boolean temFloresta) {
        this.temFloresta = temFloresta;
    }
    public boolean isTemRio() {
        return temRio;
    }
    public void setTemRio(boolean temRio) {
        this.temRio = temRio;
    }


}
