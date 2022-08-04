package easy;

import javax.swing.*;

public class Exercicio_04_easy {
    public static void main(String[] args) {
        int numeroDigitado, resultado;

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        resultado = numeroDigitado * 2;
        System.out.println("O dobro do valor digitado é:" + resultado);
    }
}
