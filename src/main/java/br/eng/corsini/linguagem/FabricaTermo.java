package br.eng.corsini.linguagem;

import java.util.HashMap;

public class FabricaTermo {
    private HashMap<String,Palavra> palavras = new HashMap<String,Palavra>();
    public Termo getTermo(String str){
        try{
            Numero n = new Numero();
            n.setValor(Double.parseDouble(str));
            return n;
        }catch(Exception ex){
            Palavra p = palavras.get(str);
            if(p==null){
                p = new Palavra();
                p.setCaracteres(str);
                palavras.put(str, p);
            }
            return p;
        }
    }
    public HashMap<String, Palavra> getPalavras() {
        return palavras;
    }
    public void setPalavras(HashMap<String, Palavra> palavras) {
        this.palavras = palavras;
    }
    
}
