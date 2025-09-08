package br.edu.unifei.ecot12.spider;

import java.util.Date;

public class TransformacaoAranha {
    public Evento piacada(String nome, String codinome){
        Fisico f1 = new Fisico();
        f1.setNome("andar pelas paredes");
        f1.setPeso(1000);
        Fisico f2 = new Fisico();
        f2.setNome("super forca");
        f2.setPeso(1000);
        Aranha a = new Aranha();
        a.setCodinome(codinome);
        a.getPoderes().add(f1);
        a.getPoderes().add(f2);
        Humano h = new Humano();
        h.setNome(nome);
        h.setTotem(a);

        Evento e = new Evento();
        e.setDescricao("Transformacao");
        e.setData(new Date());  
        e.getSeres().add(h);

        return e;
    }
}
