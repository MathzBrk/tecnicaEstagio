package controller;

import model.VerificadorLetraA;
import view.VisaoLetraA;

public class ControladorLetraA {
    private VisaoLetraA visaoLetraA;
    private VerificadorLetraA verificadorLetraA;

    public ControladorLetraA(VisaoLetraA visaoLetraA, VerificadorLetraA verificadorLetraA) {
        this.visaoLetraA = visaoLetraA;
        this.verificadorLetraA = verificadorLetraA;
    }

    public void verificarLetraA(){
        String texto = visaoLetraA.obterTexto();
        boolean existe = verificadorLetraA.existeLetraA(texto);
        int ocorrencias = verificadorLetraA.contarOcorrencias(texto);

        if(existe){
            visaoLetraA.mostrarResultado("A letra 'a' aparece " + ocorrencias + " vezes no texto.");
        } else{
            visaoLetraA.mostrarResultado("A letra 'a' não aparece no texto.");
        }
    }
}
