package medium;

import javax.swing.*;

public class Exercicio_05_medium {

    static int numeroDigitado, menorNumero, i =1;
    public static void main(String[] args) {
        while (1<=5){
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "numero:"));
            if (numeroDigitado < menorNumero || i == 1){
                menorNumero = numeroDigitado;
            }
            i++;
        }

    }
}
