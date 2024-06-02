package ProjetoCalculadora;

/**
 * Classe que contém todas as constantes usadas na calculadora.
 */
public final class Constants {

    /**
     * Constantes relacionadas à operação de soma.
     */
    public static final class SomaConstants {
        /**
         * Mensagem de resultado da soma.
         */
        public static final String kStr = "Resultado da Soma: ";
    }

    /**
     * Constantes relacionadas à operação de subtração.
     */
    public static final class SubtConstants {
        /**
         * Mensagem de resultado da subtração.
         */
        public static final String kStr = "Resultado da Subtração: ";
    }

    /**
     * Constantes relacionadas à operação de multiplicação.
     */
    public static final class MultConstants {
        /**
         * Mensagem de resultado da multiplicação.
         */
        public static final String kStr = "Resultado da Multiplicação: ";
    }

    /**
     * Constantes relacionadas à operação de divisão.
     */
    public static final class DivConstants {
        /**
         * Mensagem de resultado da divisão.
         */
        public static final String kStr = "Resultado da Divisão: ";
    }

    /**
     * Constantes relacionadas à operação de raiz quadrada.
     */
    public static final class RQConstants {
        /**
         * Mensagem de resultado da raiz quadrada.
         */
        public static final String kStr = "A Raiz quadrada é: ";
    }

    /**
     * Constantes relacionadas à operação de raiz cúbica.
     */
    public static final class RCConstants {
        /**
         * Mensagem de resultado da raiz cúbica.
         */
        public static final String kStr = "A Raiz cubica é: ";
    }

    /**
     * Constantes relacionadas à operação de potência.
     */
    public static final class PotConstants {
        /**
         * Mensagem de resultado da potência.
         */
        public static final String kStr = "Resultado da Potência: ";
    }

    /**
     * Constantes relacionadas à operação de porcentagem.
     */
    public static final class PercConstants {
        /**
         * Mensagem para pedir o número para descobrir a porcentagem.
         */
        public static final String kFirst = "Digite o número à descobrir a porcentagem: ";
        /**
         * Mensagem de resultado da porcentagem.
         */
        public static final String kStr = "A porcentagem é: ";
    }

    /**
     * Constantes relacionadas à operação da calculadora.
     */
    public static final class CalcConstants {
        /**
         * Mensagem para pedir a operação desejada.
         */
        public static final String kStrOperacao = "Digite a operação desejada:\n"
                + "(+) para Soma\n"
                + "(-) para Subtração\n"
                + "(*) para Multiplicação\n"
                + "(/) para Divisão\n"
                + "(^) para Potência\n"
                + "(²) para Raiz Quadrada\n"
                + "(³) para Raiz cubica\n"
                + "(%) para descobrir porcentagem\n";

        /**
         * Mensagem de aviso para a operação de potência.
         */
        public static final String strPot = "Atenção!! Digite primeiro o numero e depois a potência";
        /**
         * Mensagem de aviso para a operação de raiz quadrada.
         */
        public static final String strRQ = "Atenção!! Você receberá o radicando 'arredondado' ao índice 2";
        /**
         * Mensagem de aviso para a operação de raiz cúbica.
         */
        public static final String strRC = "Atenção!! Você receberá o radicando 'arredondado' ao índice 3";
    }

    /**
     * Constantes relacionadas a operações inválidas.
     */
    public static final class Kinvalid {
        /**
         * Mensagem de operação inválida.
         */
        public static final String invOper = "Operação Invalida";
    }

    /**
     * Constantes relacionadas à entrada do usuário.
     */
    public static final class kObey {
        /**
         * Mensagem para pedir o primeiro número.
         */
        public static final String nmr1Str = "Digite o primeiro número: ";
        /**
         * Mensagem para pedir o segundo número.
         */
        public static final String nmr2Str = "Digite o segundo número: ";
        /**
         * Mensagem para pedir o número total.
         */
        public static final String nmrPerc = "Digite o número total: ";
        /**
         * Mensagem para pedir o número desejado.
         */
        public static final String nmrDes = "Digite o número desejado: ";
        /**
         * Mensagem para perguntar se o usuário deseja continuar calculando.
         */
        public static final String kCont = "Deseja continuar calculando? digite 'sim' para continuar";
    }
}
