import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String opt;

        int pacotes;


        System.out.println("Faça seu pedido ");
        pacotes = entrada.nextInt();

        switch (pacotes) {
            case 1: opt = "10 esfihas";
                break;
            case 2: opt = "20 esfihas";
                break;
            case 3: opt = "30 esfihas";
                break;
            case 4: opt = "40 esfihas";
                break;
            case 5: opt = "55 esfihas";
                break;
            default: opt = "não é valido";
        }

        System.out.println(opt);
    }
}