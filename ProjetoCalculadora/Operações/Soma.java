package ProjetoCalculadora.Operações;

public class Soma extends CalculatingBase {

    public Soma(int oper) {
        super(oper);
        double resultado = this.numero1 + this.numero2;
        System.out.println("Resultado da Soma: " + resultado);
    }
}
