package MenuUtilidades;

import java.util.Scanner;

public class Utilidades {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean execute = true;

        while (execute) {
            System.out.println("\n"
                + "Digite a sua necessidade\n"
                + "(1) para Calculadora\n"
            );

            int utilidade = getUtilidade();

            if (utilidade == 1) {
                new Calculadora();
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static int getUtilidade() {
        return scan.nextInt();
    }
}
