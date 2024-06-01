package ProjetoCalculadora;

import java.util.Scanner;

import ProjetoCalculadora.Constants.CalcConstants;
import ProjetoCalculadora.Constants.Kinvalid;
import ProjetoCalculadora.Constants.kObey;
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
    
    public static int getOperação(){
        System.out.println(CalcConstants.kStrOperacao);
        return scan.nextInt();
    }

    private static void execute(int operação){
        if (operação == 1){
            new Soma(1);
        } else if (operação == 2){
            new Subtracao(2);
        } else if (operação == 3){
            new Multiplicacao(3);
        } else if (operação == 4){
            new Divisao(4);
        } else if (operação == 5){
            System.out.println(CalcConstants.strPot);
            new Potencia(5);
        } else if (operação == 6){
            System.out.println(CalcConstants.strRQ);
            new RaizQuadrada(6); 
        } else if (operação == 7){
            System.out.println(CalcConstants.strRC);
            new RaizCubica(7);
        } else {
            System.out.println(Kinvalid.invOper);
            continueCalculating();
        }
    }

    private static boolean continueCalculating(){
        System.out.println(kObey.kCont);
        String resposta = scan.next();
        return resposta.equalsIgnoreCase("sim");
    }
}