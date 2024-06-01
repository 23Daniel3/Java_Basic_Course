package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.RQConstants;

public class RaizQuadrada extends CalculatingBase {

    public RaizQuadrada(int oper){
        super(oper);
        double result = Math.sqrt(numero1);
        System.out.println(RQConstants.kStr + result);
    }
}
