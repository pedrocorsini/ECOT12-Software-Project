package br.eng.corsini.documento;

public class DocumentoGrande implements Visitante {

    @Override
    public boolean visitar(Texto t) {
        if(t.getConteudo().length()>1000){
            t.resumo280();
            return true;
        }else return false;
    }

    public boolean visitar(Planilha p) {
        int t = p.getUltimaColuna()*p.getUltimaColuna();
        if(t>1000){
            p.unicaPagina();
            return true;
        }else return false;
    }

    public boolean visitar(Desenho d) {
        int t = d.getLinhas()*d.getColunas();
        if(t>1000){
            d.apresentar4k();
            return true;
        }else return false;
    }

}
