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
            String operação = getOperação();
            execute(operação);
            continuar = continueCalculating();
        }
    }

    public static double getFirstNumber(){
        System.out.println(kObey.nmrDes);        
        return scan.nextDouble();
    }
    
    public static String getOperação(){
        System.out.println(CalcConstants.kStrOperacao);
        return scan.next();
    }

    private static void execute(String operação){
        if (operação.equals("+")){
            new Soma(firstNumber, 1);
        } else if (operação.equals("-")){
            new Subtracao(firstNumber, 2);
        } else if (operação.equals("*")){
            new Multiplicacao(firstNumber, 3);
        } else if (operação.equals("/")){
            new Divisao(firstNumber, 4);
        } else if (operação.equals("^")){
            System.out.println(CalcConstants.strPot);
            new Potencia(firstNumber, 5);
        } else if (operação.equals("²")){
            System.out.println(CalcConstants.strRQ);
            new RaizQuadrada(firstNumber, 6); 
        } else if (operação.equals("³")){
            System.out.println(CalcConstants.strRC);
            new RaizCubica(firstNumber, 7);
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