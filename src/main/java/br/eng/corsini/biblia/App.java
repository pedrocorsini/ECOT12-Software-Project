package br.eng.corsini.biblia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import br.eng.corsini.linguagem.FabricaTermo;
import br.eng.corsini.linguagem.Termo;

public class App {
    public static void main(String[] args) throws IOException {
        String nomeArq = App.class.getClassLoader().getResource("ecot12-biblia.txt").getFile();
        BufferedReader br = new BufferedReader(new FileReader(nomeArq));
        FabricaTermo ft = new FabricaTermo();
        int contador = 0;
        while (br.ready()) {
            String linha = br.readLine();
            String vet[] = linha.split(" ");
            for (String str : vet) {
                Termo t = ft.getTermo(str);
                contador++;
            }
        }
        System.out.println(contador);
        System.out.println(ft.getPalavras().size());
    }
}
