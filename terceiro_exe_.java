package org.example;
import java.util.Scanner;
import java.util.Locale;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

          /*int idade = 20;
          long idade1 = idade;//conversão por promoção
          int idade2 = (int)idade1;// conversão por casting

          float pi = 3.1415f;
          double pi2 = pi;//dxemplo de promoção
          float pi3 = (float) pi2;// exemplo de casting

          int ano = Integer. parseInt("2026");

          char letra = 'F';
          String letra1 = String.valueOf(letra);
          String letra2 =  Character.toString(letra);
          String letra3 =  " " + letra;
          ///n utilizado para quebrar linha
          //string--- char
          char = letra = 'F';
          String letra1 = String
           */
        int hora = 3;
         Scanner teclado =  new Scanner(System.in);// para receber a entrada do teclado
         teclado.useLocale(Locale.US);

         System.out.println("Entre com os lanches da primeira hora: ");
         int phora = teclado.nextInt(); //entrada com um numero inteiro
        // next algo o que eu irei recber


        System.out.println("Entre com os lanches da segunda hora: ");
        int shora = teclado.nextInt(); //entrada com um numero inteiro
        // next algo o que eu irei recber

        System.out.println("Entre com os lanches da terceira hora: ");
        int thora = teclado.nextInt(); //entrada com um numero inteiro
        // next algo o que eu irei recber

        int soma = (phora+shora+thora);
        float media = soma/hora;

        System.out.println("A media dos lanches é "+media);


    }
}