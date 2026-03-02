package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int NPA = teclado.nextInt();
        float NFA=0;
        int NP3 =0;
        int NB=0;

        if (NPA >= 60) {
            System.out.println("Aprovado");
            NFA = NPA;
        }
        else if (NPA < 30) {
            System.out.println("Reprovado");
            NFA = NPA;

        } else {
            System.out.println("O aluno deverá fazer a NP3");
            System.out.println("Nota da NP3");
            NP3 = teclado.nextInt();
            NB = (NPA + NP3);
            NFA = NB/2;
            if(NFA >= 50)
                System.out.println("Aprovado");
            else
            {
                System.out.println("Reprovado");
            }
        }

    }
}
