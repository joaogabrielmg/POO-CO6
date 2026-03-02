package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inatel = new Scanner(System.in);
        int alunos = inatel.nextInt();
        switch (alunos)
        {
            case 10:
                System.out.println("Sala I-6");
                break;
            case 20:
                System.out.println("Sala I-6");
                break;
            case 30:
                System.out.println("Sala I-5");
                break;
            default ://fora do case
                System.out.println("Alunos invalidos para uma sala de aula");
        }

    }
}