package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.MultConstants;

public class Multiplicacao extends CalculatingBase{

    double numero1;

    public Multiplicacao(double firstNumber, int oper){
        super(oper);        
        this.numero1 = firstNumber;
        double result = numero1 * numero2;
        System.out.println(MultConstants.kStr + result);
    }
}
