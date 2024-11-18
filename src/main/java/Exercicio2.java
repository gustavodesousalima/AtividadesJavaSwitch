import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        String msg;

        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("digte um numero: ");
        numero = entrada.nextInt();

        switch(numero){
            case 1: msg = "é Janeiro";
                break;
            case 2: msg = "é Fevereiro";
                break;
            case 3: msg = "é Março";
                break;
            case 4: msg = "é Abril";
                break;
            case 5: msg = "é Maio";
                break;
            case 6: msg = "é Junho";
                break;
            case 7: msg = "é Julho";
                break;
            case 8: msg = "é Agosto";
                break;
            case 9: msg = "é Setembro";
                break;
            case 10: msg = "é Outubro";
                break;
            case 11: msg = "é Novembro";
                break;
            case 12: msg = "é Dezembro";
                break;
            default: msg = "não é valido";
        }

        System.out.println(msg);
    }
}