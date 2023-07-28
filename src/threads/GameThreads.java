package threads;
import java.util.Random;
import java.util.Scanner;

public class GameThreads implements Runnable {

    String naipes[] = {"Paus", "Copas", "Espada", "Ouros"};

    @Override
    public void run() {
        try {
        Random random = new Random();
        int n3 = random.nextInt(naipes.length);
        String naipe = naipes[n3];

        int n1 = random.nextInt(13);
        n1 += 1;
        switch (n1) {
            case 1:
                System.out.println("Carta do jogador: ás " + naipe);
                n1 = 1;
                break;
            case 11:
                System.out.println("Carta do jogador: J " + naipe);
                n1 = 10;
                break;
            case 12:
                System.out.println("Carta do jogador: Q " + naipe);
                n1 = 10;
                break;
            case 13:
                System.out.println("Carta do jogador: K " + naipe);
                n1 = 10;
                break;
            default:
                System.out.println("Carta do jogador: " + n1 + " " + naipe);
                break;
        }

        int n2 = random.nextInt(13);
        n2 += 1;
        switch (n2) {
            case 1:
                System.out.println("Carta do jogador: ás " + naipe);
                n2 = 1;
                break;
            case 11:
                System.out.println("Carta do jogador: J " + naipe);
                n2 = 10;
                break;
            case 12:
                System.out.println("Carta do jogador: Q " + naipe);
                n2 = 10;
                break;
            case 13:
                System.out.println("Carta do jogador: K " + naipe);
                n2 = 10;
                break;
            default:
                System.out.println("Carta do jogador: " + n2 + " " + naipe);
                break;
        }

        int totalDePontos = n1 + n2;

        System.out.println("O total de pontos do jogador é: " + totalDePontos);
        if (totalDePontos == 21) {
            System.out.println("Parabéns, você ganhou!");
        }
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
