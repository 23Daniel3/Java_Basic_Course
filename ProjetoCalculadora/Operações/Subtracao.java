package ProjetoCalculadora.Operações;

public class Subtracao extends CalculatingBase{

    public Subtracao(){
        System.out.println("Digite o segundo número: ");
        this.numero2 = scan.nextDouble();
        
        double result = numero1 - numero2;
        System.out.println("O resultado é: " + result);
    }
}
