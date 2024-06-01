package ProjetoCalculadora.Operações;

import java.util.Scanner;

public class CalculatingBase {

    protected double numero1 = 0;
    protected double numero2 = 0;

    Scanner scan = new Scanner(System.in);

    public CalculatingBase(int oper){
        if (oper == (1 | 2 | 3 | 4)){
            System.out.println("Digite o primeiro número: ");
            this.numero1 = scan.nextDouble();
            System.out.println("Digite o segundo número: ");
            this.numero2 = scan.nextDouble();
        } else if ((oper == (5 | 6 | 7))){
            System.out.println("Digite o número desejado: ");
            this.numero1 = scan.nextDouble();
        }
    }
}
