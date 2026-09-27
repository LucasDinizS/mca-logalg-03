import java.util.Scanner;

public class Ex6 {
    public static void Solution(Scanner scan){
        boolean com_conexao;
        System.out.println("O usuário está conectado? (1 para sim, outro número para não");
        com_conexao = scan.nextInt() == 1;
        if(!com_conexao){
            System.out.println("Modo Offline ativado. Executando músicas baixadas.");
        }
    }
}
