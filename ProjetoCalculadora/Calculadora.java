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
    private static double firstNumber;

    public static void main(String[] args){

        boolean continuar = true;

        while (continuar){
            firstNumber = getFirstNumber();
            int operação = getOperação();
            execute(operação);
            continuar = continueCalculating();
        }
    }

    public static double getFirstNumber(){
        System.out.println(kObey.nmrDes);        
        return scan.nextDouble();
    }
    
    public static int getOperação(){
        System.out.println(CalcConstants.kStrOperacao);
        return scan.nextInt();
    }

    private static void execute(int operação){
        if (operação == 1){
            new Soma(firstNumber, 1);
        } else if (operação == 2){
            new Subtracao(getFirstNumber(), 2);
        } else if (operação == 3){
            new Multiplicacao(getFirstNumber(), 3);
        } else if (operação == 4){
            new Divisao(getFirstNumber(), 4);
        } else if (operação == 5){
            System.out.println(CalcConstants.strPot);
            new Potencia(getFirstNumber(), 5);
        } else if (operação == 6){
            System.out.println(CalcConstants.strRQ);
            new RaizQuadrada(getFirstNumber(), 6); 
        } else if (operação == 7){
            System.out.println(CalcConstants.strRC);
            new RaizCubica(getFirstNumber(), 7);
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