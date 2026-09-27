import java.util.Scanner;

public class Ex7 {
    public static void Solution(Scanner scan){
        boolean tanque_reserva;
        System.out.println("O tanque está na reserva? (1 para sim, outro número para não)");
        tanque_reserva = scan.nextInt() == 1;
        if(!tanque_reserva){
            System.out.println("Decolagem autorizada! Sistemas em perfeito estado.");
        }
    }
}
