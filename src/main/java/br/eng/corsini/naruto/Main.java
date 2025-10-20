package br.eng.corsini.naruto;

public class Main {
    public static void main(String[] args) {

        //Nagato, apelidado como Pain, é um shinobi de categoria jounin, optou em ser renegado, nasceu na Vila da Chuva. Sua habilidade
        //Kekkei Genkai é o Rinnegan. Nagato manipula os jutsus: Ataque Asura (ninjustu), Chibaku Tensei (ninjustu), e Seis Caminhos Rinne (taijutsu)
        KekkeiGenkai r = new KekkeiGenkai();
        r.setNome("Rinnegan");
        Shinobi n = new Shinobi();
        n.setNome("Nagato");
        n.setApelido("Pain");
        n.setRenegado(true);
        n.getKekkeiGenkais().add(r);
    }
}