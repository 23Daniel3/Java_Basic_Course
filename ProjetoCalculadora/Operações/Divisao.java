package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.DivConstants;

public class Divisao extends CalculatingBase {

    double numero1;

    public Divisao(double firstNumber, int oper){
        super(oper);        
        this.numero1 = firstNumber;
        double result = numero1 / numero2;
        System.out.println(DivConstants.kStr + result);
    }

}
