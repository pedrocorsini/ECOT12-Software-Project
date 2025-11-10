package br.eng.corsini.documento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Documento> lista = new ArrayList<Documento>();
        Texto t = new Texto();
        t.setSigilo(true);
        lista.add(t);
        Planilha p = new Planilha();
        p.setConfidencial(true);
        lista.add(p);
        Desenho d = new Desenho();
        d.setPublico(true);
        lista.add(d);
        Sigilo v = new Sigilo();
        for(Documento doc : lista){
            if (doc.aceitar(v)){
                System.out.println(doc);
            }
        }
    }
}
