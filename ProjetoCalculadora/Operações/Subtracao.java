package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.SubtConstants;

public class Subtracao extends CalculatingBase {

    public Subtracao(int oper) {
        super(oper);
        double resultado = numero1 - numero2;
        System.out.println(SubtConstants.kStr + resultado);
    }
}
