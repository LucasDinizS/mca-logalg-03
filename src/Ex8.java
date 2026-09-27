import java.util.Scanner;

public class Ex8
{
    public static void Solution(Scanner scan){
        boolean obstaculo_detectado;
        System.out.println("Detectou algum obstáculo? (1 para sim, outro número para não)");
        obstaculo_detectado = scan.nextInt() == 1;
        if(!obstaculo_detectado){
            System.out.println("Portão abrindo com segurança.");
        }
    }
}
