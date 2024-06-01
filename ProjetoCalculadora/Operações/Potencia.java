package ProjetoCalculadora.Operações;

public class Potencia extends CalculatingBase{

    public Potencia(){
        System.out.println("Digite o segundo número: ");
        this.numero2 = scan.nextDouble();
        
        double result = Math.pow(numero1, numero2);
        System.out.println("O resultado é: " + result);
    }
}
