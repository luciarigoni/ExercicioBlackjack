import threads.DealerThreads;
import threads.GameThreads;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao jogo Blackjack!");

        System.out.println("Vamos começar? yes/no");
        String iniciar = sc.nextLine();
        if (iniciar.equals("yes") || iniciar.equals("Yes")) {
            System.out.println("Vamos nessa!");
        }
        else {
            System.out.println("Infelizmente não poderemos prosseguir.");
            while (iniciar != "yes" || iniciar != "Yes") {
                System.out.println("Vamos começar? yes/no");
                String iniciarJogo1 = sc.nextLine();
                if (iniciarJogo1.equals("yes") || iniciarJogo1.equals("Yes")) {
                    System.out.println("Vamos nessa!");
                    break;
                }
            }
        }

        GameThreads gameThreads = new GameThreads();
        DealerThreads dealerThreads = new DealerThreads();

        Thread t1 = new Thread(gameThreads);
        Thread t2 = new Thread(dealerThreads);
        t1.start();
        t2.start();

        sc.close();
    }
}