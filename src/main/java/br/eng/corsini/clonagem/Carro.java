package br.eng.corsini.clonagem;

public class Carro implements Prototipo<Carro> {
    private String marca;
    private String modelo;
    private String placa;
    private int potencia;
    public Carro clone(){
        Carro c = new Carro();
        c.marca = this.marca;
        c.modelo = this.modelo;
        c.placa = this.placa;
        c.potencia = this.potencia;
        return c;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
