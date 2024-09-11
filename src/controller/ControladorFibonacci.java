package controller;

import model.VerificadorFibonacci;
import view.VisaoFibonacci;

public class ControladorFibonacci {
    private VerificadorFibonacci verificadorFibonacci;
    private VisaoFibonacci visaoFibonacci;

    public ControladorFibonacci(VerificadorFibonacci verificadorFibonacci, VisaoFibonacci visaoFibonacci) {
        this.verificadorFibonacci= verificadorFibonacci;
        this.visaoFibonacci = visaoFibonacci;
    }

    public void checarFibonacci() {
        int numero = visaoFibonacci.pegarEntrada();
        boolean resultado = verificadorFibonacci.isFibonacci(numero);
        if (resultado) {
            visaoFibonacci.mostrarResultado("O número " + numero + " está na sequência!");
        } else{
            visaoFibonacci.mostrarResultado("O número " + numero + " não está na sequência!");
        }
    }
}
