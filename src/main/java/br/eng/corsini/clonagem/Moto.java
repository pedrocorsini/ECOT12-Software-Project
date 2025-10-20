package br.eng.corsini.clonagem;

public class Moto implements Prototipo<Moto>{
    private String marca;
    private float cilindrada;
    public Moto clone(){
        Moto m = new Moto();
        m.marca = this.marca;
        m.cilindrada = this.cilindrada;
        return m;   
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
    

