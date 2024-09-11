package view;

import java.util.Scanner;

public class VisaoLetraA {
    private Scanner scanner = new Scanner(System.in);

    public String obterTexto(){
        System.out.println("Digite uma string: ");
        return scanner.nextLine();
    }

    public void mostrarResultado(String mensagem){
        System.out.println(mensagem);
    }
}
