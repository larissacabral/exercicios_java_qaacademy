package easy;

import javax.swing.*;

public class Exercicio_05_easy {

    static int valorInformado1, valorInformado2, valorInformado3, soma, subtracao, multiplicacao, divisaomedia;

    public static void main(String[] args){
        valorInformado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        valorInformado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        valorInformado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));

        soma = valorInformado1 + (valorInformado2 + valorInformado3);
        subtracao = (valorInformado3 - valorInformado2) - valorInformado1;
        multiplicacao = (valorInformado1 * valorInformado2) * valorInformado3;
        divisaomedia = soma/2;
        System.out.println("A soma dos valores é: \n" + soma + "\n subtracao: " + subtracao);




    }
}
