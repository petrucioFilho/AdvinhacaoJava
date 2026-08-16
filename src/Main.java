import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        int valor = aleatorio.nextInt(100);
        int chances = 1;
        boolean acertou = false;

        System.out.println("Tente acertar o número aleatório ente 0 a 100:");
        while (chances <= 5 && !acertou)
        {
            if(leitura.nextInt() == valor) acertou = true;
            else System.out.println("Tente outro número!");
            chances++;
        }

        if (acertou) System.out.println("Você acertou o valor");
        else System.out.println("Não foi dessa vez, tente na próxima!");

    }
}