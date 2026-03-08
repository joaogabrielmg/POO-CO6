package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de ingressos de meia entrada:");
        int ingressosmeia = teclado.nextInt();

        System.out.println("Digite a quantidade de ingressos de entrada inteira:");
        int ingressosinteiro = teclado.nextInt();

        teclado.nextLine();//limpa para evitar erros no string
        System.out.println("Digite o valor do Ingresso de meia entrada:");
        String valor = teclado.nextLine();   // lê o que a pessoa digitou
        valor = valor.replace(",", ".");     // troca , por .
        float valormeio = Float.parseFloat(valor);  // transforma em número
        System.out.println("Digite o valor do Ingresso inteiro: ");
        String valor2 = teclado.nextLine();
        valor2 = valor2.replace(",",".");
        float valorinteiro = Float.parseFloat(valor2);
        float totalvalorinteiro = valorinteiro*ingressosinteiro;
        float totalvalormeia = valormeio*ingressosmeia;
        float totalgeraldovalor = totalvalormeia+totalvalorinteiro;
        int  totalgeraldaqatd = ingressosinteiro+ingressosmeia;
        float  media = totalgeraldovalor / totalgeraldaqatd;
        System.out.println("O valor total dos ingressos inteiros é : " + totalvalorinteiro);
        System.out.println("O valor total dos ingressos pelo meio é :"+ totalvalormeia);
        System.out.println("O valor total dos dois é: "+ totalgeraldovalor);
        System.out.println("O valor total da quantidade é:"+ totalgeraldaqatd);
        System.out.println("O valor da media de cada ingresso : " + media);
   }
}