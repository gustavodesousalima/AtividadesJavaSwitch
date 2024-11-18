import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        int semafaro;

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero: ");



        semafaro = entrada.nextInt();

        String msg;

        switch(semafaro){
            case 1: msg="verde";
                break;
            case 2: msg="amarelo";
                break;
            case 3: msg="vermelho";
                break;
            default: msg="Não é valido";
        }

        System.out.println(msg);
    }
}