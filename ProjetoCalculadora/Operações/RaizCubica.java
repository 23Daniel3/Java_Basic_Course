package ProjetoCalculadora.Operações;

public class RaizCubica extends CalculatingBase{

    public RaizCubica(int oper){
        super(oper);
        double result = Math.cbrt(numero1);
        System.out.println("A Raiz cubica é: " + result);
    }
}
