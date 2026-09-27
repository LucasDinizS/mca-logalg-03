import java.util.Scanner;

public class Ex4 {
    public static void Solution(Scanner scan){
        boolean aceitou_termos;
        System.out.println("O usuário aceitou os termos? (1 pra sim, outro número pra não)");
        aceitou_termos = scan.nextInt() == 1;
        if(!aceitou_termos){
            System.out.println("Acesso negado. Você precisa aceitar os termos de serviço para jogar.");
        }
    }
}
