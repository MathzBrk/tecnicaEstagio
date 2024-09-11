import controller.ControladorFibonacci;
import controller.ControladorLetraA;
import model.VerificadorFibonacci;
import model.VerificadorLetraA;
import view.VisaoFibonacci;
import view.VisaoLetraA;

public class Main {
    public static void main(String[] args) {
        // Questão 1
        VerificadorFibonacci verificadorFibonacci = new VerificadorFibonacci();
        VisaoFibonacci visaoFibonacci = new VisaoFibonacci();
        ControladorFibonacci controladorFibonacci = new ControladorFibonacci(verificadorFibonacci, visaoFibonacci);
        controladorFibonacci.checarFibonacci();

        //Questão 2
        VerificadorLetraA verificadorLetraA = new VerificadorLetraA();
        VisaoLetraA visaoLetraA = new VisaoLetraA();
        ControladorLetraA controladorLetraA = new ControladorLetraA(visaoLetraA, verificadorLetraA);
        controladorLetraA.verificarLetraA();

        // Questão 3
        int i = 12, s = 0, k = 1;
        while (k < i){
            k += 1;
            s += k;
        }
        System.out.println(s);
    }
}