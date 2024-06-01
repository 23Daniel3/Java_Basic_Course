package ProjetoCalculadora.Operações;

import java.util.Scanner;

public class CalculatingBase {

    protected double numero1 = 0;
    protected double numero2 = 0;

    Scanner scan = new Scanner(System.in);

    public CalculatingBase(){
        System.out.println("Digite o primeiro número: ");

        this.numero1 = scan.nextDouble();
    }
}
