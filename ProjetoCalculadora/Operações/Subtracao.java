package ProjetoCalculadora.Operações;

public class Subtracao extends CalculatingBase {

    public Subtracao(int oper) {
        super(oper);
        double resultado = this.numero1 - this.numero2;
        System.out.println("Resultado da Subtração: " + resultado);
    }
}
