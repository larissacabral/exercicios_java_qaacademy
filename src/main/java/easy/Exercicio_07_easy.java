package easy;

import javax.swing.*;

public class Exercicio_07_easy {
    public static void main(String[] args) {
        double salario, inss = 0;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o Salário para calculos:"));

        if(salario <= 1045.00)
            inss = salario * 0.075;

        if(salario >= 1045.01 && salario <= 2089.60)
            inss = salario * 0.09;

        if(salario >= 2089.61 && salario<= 3134.40)
            inss = salario * 0.12;

        if(salario >= 3134.41 && salario <= 6101.06)
            inss = salario * 0.14;

        if (salario >=6101.07)
            //or  else
            inss = salario * 0.14;

        {
            System.out.println("O valor do INSS é:" + inss);
        }
    }
}
