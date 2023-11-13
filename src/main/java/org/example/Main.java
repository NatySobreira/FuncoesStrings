package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Funções de Strings!");
        System.out.println("Replace");
        String texto = "12-11-2023";
        System.out.println("Texto original: " + texto);
        String textoModificado = texto.replace("-", "/");
        System.out.println("Texto modificado: " + textoModificado);

        System.out.println("***");
        System.out.println("Trim e Lenght");
        texto = "   Muitos espaços   ";
        System.out.println("Texto original: " + texto);
        System.out.println("Texto original caracteres: " + texto.length());
        textoModificado = texto.trim();
        System.out.println("Texto modificado: " + textoModificado);
        System.out.println("Texto modificado caracteres: " + textoModificado.length());


        System.out.println("***");
        System.out.println("Contains");
        texto = "meuemailyahoo.com.br";
        System.out.println("Texto original: " + texto);
        //USANDO TERNARIO...
        String localizado = texto.contains("@")
                ? "Email verificado corretamente..."
                : "Não é um email válido...";
        System.out.println(localizado);

//        double tempoDeServico = 6;
//        double salario = 1000.00;
//        double bonus = tempoDeServico <= 3
//                ? salario * 0.05
//                : tempoDeServico > 3 && tempoDeServico <= 5
//                ? salario * 0.07
//                : salario * 0.10;


        System.out.println("***");
        System.out.println("toLowerCase / toUpperCase");
        texto = "Fábio Ferreira";
        System.out.println("Texto original: " + texto);
        textoModificado = texto.toLowerCase();
        System.out.println("Texto modificado minúsculo: " + textoModificado);
        textoModificado = texto.toUpperCase();
        System.out.println("Texto modificado maiusculo: " + textoModificado);


        System.out.println("***");
        System.out.println("substring / indexOf");
        texto = "(31) 99100-0000";
        System.out.println("Texto original: " + texto);
        int posicao = texto.indexOf(")");
        if (posicao >= 0) textoModificado = texto.substring(posicao + 1);
        System.out.println("Texto modificado: " + textoModificado.trim());
    }
}