package medium;

public class Exercicio_8_medium {


    public static void main(String[] args) {
        int i = 0;
        String vetorMeses[] = new String[12];
        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";

        while (1<12){
            System.out.println("O mes" + (i+1)+ "-" + vetorMeses[i]);
            i++;}
        }
    }
}
