package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.PercConstants;

public class Percentage extends CalculatingBase{

    double numero1;
    float result;

    public Percentage(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        result = (float) ((firstNumber * 100) / numero2);
        System.out.println(PercConstants.kStr + result + "%");
    }
}
