package model;

public class VerificadorLetraA {

    public int contarOcorrencias(String texto) {
        int contador = 0;
        char letra;
        for (int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        return contador;
    }

    public boolean existeLetraA(String texto) {
        return texto.toLowerCase().contains("a");
    }
}
