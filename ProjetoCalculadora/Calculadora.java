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
       switch (operação) {
        case "+":
        new Soma(firstNumber, 1);
            break;
        case "-":
            new Subtracao(firstNumber, 2);
            break;
        case "*":
            new Multiplicacao(firstNumber, 3);
            break;
        case "/":
            new Divisao(firstNumber, 4);
            break;
        case "^":
            System.out.println(CalcConstants.strPot);
            new Potencia(firstNumber, 5);
            break;
        case "²":
            System.out.println(CalcConstants.strRQ);
            new RaizQuadrada(firstNumber, 6);
            break;
        case "³":
            System.out.println(CalcConstants.strRC);
            new RaizCubica(firstNumber, 7);
            break;
        default:
            System.out.println(Kinvalid.invOper);
            continueCalculating();
            break;
       }
    }

    private static boolean continueCalculating(){
        System.out.println(kObey.kCont);
        String resposta = scan.next();
        return resposta.equalsIgnoreCase("sim");
    }
}