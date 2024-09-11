package view;

import java.util.Scanner;

public class VisaoFibonacci {
    private Scanner scanner = new Scanner(System.in);

    public int pegarEntrada(){
        System.out.println("Informe um número para ver se ele está na sequência de fibonnaci: ");
        return scanner.nextInt();
    }

    public void mostrarResultado(String mensagem){
        System.out.println(mensagem);
    }
}
