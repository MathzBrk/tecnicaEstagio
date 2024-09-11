package model;

public class VerificadorFibonacci {
    public boolean isFibonacci(int numero) {
        if(numero == 0 || numero == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int proximo = a + b;

        for(int i = 2; proximo <= numero; i++) {
            if(proximo == numero){
                return true;
            }
            a = b;
            b = proximo;
            proximo = a + b;
        }

        return false;
    }
}
