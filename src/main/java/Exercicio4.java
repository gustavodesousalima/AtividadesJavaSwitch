import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int codigoSalario;

        String posicoes;

        System.out.println("coloque o codigo do salario ");
        codigoSalario = entrada.nextInt();

        switch (codigoSalario){

            case 1: posicoes = "junior: 2000";
                break;
            case 2: posicoes = "pleno: 4000";
                break;
            case 3: posicoes = "senior: 6000";
                break;
            case 4: posicoes = "tech lead: 10.000";
                break;
            case 5: posicoes = "principal enginner 20.000";
                break;
            default: posicoes = "não existe";
        }

        System.out.println(posicoes);

    }
}