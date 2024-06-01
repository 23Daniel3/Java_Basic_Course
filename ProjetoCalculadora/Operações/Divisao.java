package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.DivConstants;

public class Divisao extends CalculatingBase {

    public Divisao(int oper){
        super(oper);        
        double result = numero1 / numero2;
        System.out.println(DivConstants.kStr + result);
    }

}
