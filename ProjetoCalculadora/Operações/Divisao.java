package ProjetoCalculadora.Operações;

public class Divisao extends CalculatingBase {

    public Divisao(){
        System.out.println("Digite o segundo número: ");
        this.numero2 = scan.nextDouble();
        
        double result = numero1 / numero2;
        System.out.println("O resultado é: " + result);
    }

}
