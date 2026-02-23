package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var inteira = 30;
        var meia = 15;
        var qtmeia = 5;
        var qtinteira = 8;
        var totalinteiro = 8 * 30;
        var totalmeia = 5 * 15;
        var valortotal = totalmeia + totalinteiro;
        var valormedio = valortotal/(inteira+meia);
        System.out.println("Total DAS Inteiras: " + totalinteiro);
        System.out.println("Total DAS Meias: " + totalmeia);
        System.out.println("Total De todas: "+valortotal);
        System.out.println("Valor Medio: "+valormedio);
    }
    
}