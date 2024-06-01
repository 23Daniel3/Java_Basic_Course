package ProjetoCalculadora.Operações;

public class RaizCubica extends CalculatingBase{

    public RaizCubica(){
        double result = Math.cbrt(numero1);
        System.out.println("O resultado é: " + result);
    }

}
