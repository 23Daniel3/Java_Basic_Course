package MenuUtilidades;

import java.util.Scanner;

import MenuUtilidades.Calculadora.Calculadora;
import MenuUtilidades.Trigonometria.Altura;
import MenuUtilidades.Trigonometria.Hipotenusa;
import MenuUtilidades.TurnTo.CelsiusToFahrenheit;
import MenuUtilidades.TurnTo.FahreinheitToCelsius;

public class Utilidades {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean execute = true;

        while (execute) {
            System.out.println("\n"
                + "Digite a sua necessidade\n"
                + "(1) para Calculadora\n"
                + "(2) para transformar graus celsius em fahrenheit\n"
                + "(3) para transformar graus fahrenheit em celsius\n"
                + "(4) para descobrir a hipotenusa entre uma base e altura\n"
                + "(5) para descobrir a altura entre uma hipotenusa e uma base\n"
            );

            int utilidade = getUtilidade();

            if (utilidade == 1) {
                new Calculadora();
            } else if (utilidade == 2){
                new CelsiusToFahrenheit();
            } else if (utilidade == 3){
                new FahreinheitToCelsius();
            } else if (utilidade == 4){
                new Hipotenusa();
            } else if (utilidade == 5){
                new Altura();
            }
            
            else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static int getUtilidade() {
        return scan.nextInt();
    }
}
