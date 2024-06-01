package ProjetoCalculadora.Operações;

public class Multiplicacao extends CalculatingBase{

    public Multiplicacao(int oper){
        super(oper);        
        double result = numero1 * numero2;
        System.out.println("O resultado é " + result);
    }
}
