package ProjetoCalculadora.Operações;

public class Potencia extends CalculatingBase{

    public Potencia(int oper){
        super(oper);
        double result = Math.pow(numero1, numero2);
        System.out.println("O resultado é: " + result);
    }
}
