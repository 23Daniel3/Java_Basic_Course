package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.RQConstants;

public class RaizQuadrada extends CalculatingBase {

    double numero1;

    public RaizQuadrada(double firstNumber, int oper){
        super(oper);
        this.numero1 = firstNumber;
        double result = Math.sqrt(numero1);
        System.out.println(RQConstants.kStr + result);
    }
}
