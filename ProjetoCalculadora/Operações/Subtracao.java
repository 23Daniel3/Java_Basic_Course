package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.SubtConstants;

public class Subtracao extends CalculatingBase {

    double numero1;

    public Subtracao(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        double resultado = numero1 - numero2;
        System.out.println(SubtConstants.kStr + resultado);
    }
}
