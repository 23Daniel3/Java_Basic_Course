package ProjetoCalculadora.Operações;

import java.util.Scanner;

import ProjetoCalculadora.Constants.kObey;

public class CalculatingBase {

    protected double numero1 = 0;
    protected double numero2 = 0;

    Scanner scan = new Scanner(System.in);

    public CalculatingBase(int oper){
        if (oper == 1 || oper == 2 || oper == 3 || oper == 4 || oper == 5){

            System.out.println(kObey.nmr1Str);
            this.numero1 = scan.nextDouble();

            System.out.println(kObey.nmr2Str);
            this.numero2 = scan.nextDouble();

        } else if ((oper == 6 || oper == 7)){

            System.out.println(kObey.nmrDes);
            this.numero1 = scan.nextDouble();
        }
    }
}
