package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.RQConstants;

public class RaizCubica extends CalculatingBase{

    public RaizCubica(int oper){
        super(oper);
        double result = Math.cbrt(numero1);
        System.out.println(RQConstants.kStr + result);
    }
}
