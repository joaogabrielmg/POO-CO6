package org.example;
import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Scanner inatel = new Scanner(System.in);
      Random rand = new Random();

      int x = rand.nextInt(10)+1;
      System.out.println(x);

      System.out.println("Qual foi o numero gerado?");
      int numero = inatel.nextInt();

      if(numero == x)
          System.out.println("Está correto");
      else
          System.out.println("Não está correto");



      /*while(qtd>) {
            System.out.println(qtd);
            qtd--;//qtd = qtd -1;
      }*/


        /*do {
            System.out.println(qtd);
            qtd = qtd - 1;
        } while(qtd >0);*/


        /*for(int i = 0; i<10;i++)
        {
            System.out.println(i);
        }*/


        /*for(int i = qtd; i>0;i--)
        {
            System.out.println(i);
        }*/

        /*int [] vetor = {1,2,3,4};
        for(int numero:vetor)
        {
            System.out.println(numero);
        }
        System.out.println("------");
        for(int i=0; i<vetor.length;i++)
        {
            System.out.println(vetor[i]);

        }*/


        /* while(qtd>0){
            qtd--;
            if (qtd == 5 )
                break;
        }*/

        /*while(qtd>0)
        {
            if(qtd == 5)
                continue;
            System.out.println(qtd);
            qtd--;
        }*/

    }
}