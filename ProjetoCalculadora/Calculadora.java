package ProjetoCalculadora;

import java.util.Scanner;

import ProjetoCalculadora.Operações.Divisao;
import ProjetoCalculadora.Operações.Multiplicacao;
import ProjetoCalculadora.Operações.Potencia;
import ProjetoCalculadora.Operações.RaizCubica;
import ProjetoCalculadora.Operações.RaizQuadrada;
import ProjetoCalculadora.Operações.Soma;
import ProjetoCalculadora.Operações.Subtracao;

public class Calculadora {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        boolean continuar = true;

        while (continuar){
            int operação = getOperação();
            execute(operação);
            continuar = continueCalculating();
        }
    }
    
    private static int getOperação(){
        System.out.println("Digite o número da operação desejada:\n"
            + "n 1 para Soma\n" 
            + "n 2 para Subtração\n"
            + "n 3 para Multiplicação\n"
            + "n 4 para Divisão\n"
            + "n 5 para Raiz Quadrada\n"
            + "n 6 para Potência\n"
            + "n 7 para Raiz cubica\n"
        );
        return scan.nextInt();
    }

    private static void execute(int operação){
        if (operação == 1){
            new Soma();
        } else if (operação == 2){
            new Subtracao();
        } else if (operação == 3){
            new Multiplicacao();
        } else if (operação == 4){
            new Divisao();
        } else if (operação == 5){
            System.out.println("Atenção!! Você receberá o radicando 'arredondado' ao índice 2");
            new RaizQuadrada(); 
        } else if (operação == 6){
            System.out.println("Atenção!! Digite primeiro o numero e depois a potência");
            new Potencia();
        } else if (operação == 7){
            System.out.println("Atenção!! Você receberá o radicando 'arredondado' ao índice 3");
            new RaizCubica();
        } else {
            System.out.println("Operação Invalida");
            continueCalculating();
        }
    }

    private static boolean continueCalculating(){
        System.out.println("Deseja continuar calculando? digite 'sim' para continuar");
        String resposta = scan.next();
        return resposta.equalsIgnoreCase("sim");
    }
}