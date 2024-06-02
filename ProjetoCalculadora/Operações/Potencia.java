package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.PotConstants;

public class Potencia extends CalculatingBase{
    
    double numero1;

    public Potencia(double firstNumber, int oper){
        super(oper);
        this.numero1 = firstNumber;
        double result = Math.pow(numero1, numero2);
        System.out.println(PotConstants.kStr + result);
    }
}
