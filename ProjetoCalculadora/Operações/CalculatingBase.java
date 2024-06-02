package ProjetoCalculadora.Operações;

import java.util.Scanner;

import ProjetoCalculadora.Constants.kObey;

public class CalculatingBase {

    protected double numero2;

    Scanner scan = new Scanner(System.in);

    public CalculatingBase(int oper){
        if (oper == 1 || oper == 2 || oper == 3 || oper == 4 || oper == 5){
            System.out.println(kObey.nmr2Str);
            this.numero2 = scan.nextDouble();
        } else if (oper == 8){
            this.numero2 = scan.nextDouble();
        }
    }
}
