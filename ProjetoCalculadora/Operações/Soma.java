package ProjetoCalculadora.Operações;

import ProjetoCalculadora.Constants.SomaConstants;

public class Soma extends CalculatingBase {

    public Soma(int oper) {
        super(oper);
        double resultado = numero1 + numero2;
        System.out.println(SomaConstants.kStr + resultado);
    }
}
