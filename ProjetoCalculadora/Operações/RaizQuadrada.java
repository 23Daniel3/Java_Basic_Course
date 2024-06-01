package ProjetoCalculadora.Operações;

public class RaizQuadrada extends CalculatingBase {

    public RaizQuadrada(int oper){
        super(oper);
        double result = Math.sqrt(numero1);
        System.out.println("A Raiz quadrada é: " + result);
    }
}
