import javax.swing.*;

public class Exercicio_06_easy {
    static double primeiraNota, segundaNota, mediaNota;

    public static void main(String[] args) {
        primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        segundaNota  = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        mediaNota    = (primeiraNota + segundaNota)/2;

        if (mediaNota > 5){
            System.out.println("Aprovado");
        } else if (mediaNota < 5){
            System.out.println("Reprovado");
        } else {
            System.out.println("ficou de exame");
        }

        //else if (mediaNota == 5){
            //System.out.println("Ficou pra exame");
        //}

    }
}



