package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.RQConstants;

public class RaizCubica extends CalculatingBase{

    double numero1;

    public RaizCubica(double firstNumber, int oper){
        super(oper);
        this.numero1 = firstNumber;
        double result = Math.cbrt(numero1);
        System.out.println(RQConstants.kStr + result);
    }
}
