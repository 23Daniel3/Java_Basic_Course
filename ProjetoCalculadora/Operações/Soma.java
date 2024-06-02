package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.SomaConstants;

public class Soma extends CalculatingBase {

    double numero1;

    public Soma(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        double resultado = numero1 + numero2;
        System.out.println(SomaConstants.kStr + resultado);
    }
}
