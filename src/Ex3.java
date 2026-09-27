import java.util.Scanner;

public class Ex3 {
    public static void Solution(Scanner scan){
        boolean isSoilWet;

        System.out.println("O solo está úmido? (1 para sim, outro número pra não)");
        isSoilWet = scan.nextInt() == 1;
        if (!isSoilWet){
            System.out.println("Irrigadores ligados: umidade abaixo do ideal");
        }
    }
}
