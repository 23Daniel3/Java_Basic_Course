package ProjetoCalculadora;

import java.util.Scanner;

import ProjetoCalculadora.Constants.CalcConstants;
import ProjetoCalculadora.Constants.Kinvalid;
import ProjetoCalculadora.Constants.PercConstants;
import ProjetoCalculadora.Constants.kObey;
import ProjetoCalculadora.Operacoes.Divisao;
import ProjetoCalculadora.Operacoes.Multiplicacao;
import ProjetoCalculadora.Operacoes.Percentage;
import ProjetoCalculadora.Operacoes.Potencia;
import ProjetoCalculadora.Operacoes.RaizCubica;
import ProjetoCalculadora.Operacoes.RaizQuadrada;
import ProjetoCalculadora.Operacoes.Soma;
import ProjetoCalculadora.Operacoes.Subtracao;

/**
 * Classe principal da calculadora.
 * Responsável por capturar a entrada do usuário, executar a operação escolhida e mostrar o resultado.
 */
public class Calculadora {

    static Scanner input = new Scanner(System.in);
    private static double firstNumber;

    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            firstNumber = getFirstNumber();
            String operacao = getOperacao();
            execute(operacao);
            continuar = continueCalculating();
        }
    }

    /**
     * Solicita ao usuário o primeiro número da operação.
     *
     * @return O primeiro número digitado pelo usuário.
     */
    public static double getFirstNumber() {
        System.out.println(kObey.nmrDes);
        return input.nextDouble();
    }

    /**
     * Solicita ao usuário a operação desejada.
     *
     * @return A operação digitada pelo usuário como uma string.
     */
    public static String getOperacao() {
        System.out.println(CalcConstants.kStrOperacao);
        return input.next();
    }

    /**
     * Solicita ao usuário se deseja continuar calculando.
     *
     * @return {@code true} se o usuário desejar continuar, {@code false} caso contrário.
     */
    private static boolean continueCalculating() {
        System.out.println(kObey.kCont);
        String resposta = input.next();
        return resposta.equalsIgnoreCase("sim");
    }

    /**
     * Executa a operação desejada com base na entrada do usuário.
     *
     * @param operacao A operação desejada como uma string.
     */
    private static void execute(String operacao) {
        switch (operacao) {
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
            case "%":
                System.out.println(PercConstants.kFirst);
                new Percentage(firstNumber, 8);
                break;
            default:
                System.out.println(Kinvalid.invOper);
                break;
        }
    }
}
