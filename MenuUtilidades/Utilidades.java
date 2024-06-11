package MenuUtilidades;

import java.util.Scanner;

import MenuUtilidades.Calculadora.Calculadora;
import MenuUtilidades.Constants.kUtilidade;
import MenuUtilidades.Quadrilatero.Area;
import MenuUtilidades.Triangulo.Altura;
import MenuUtilidades.Triangulo.Hipotenusa;
import MenuUtilidades.Triangulo.TriArea;
import MenuUtilidades.TurnTo.CelsiusToFahrenheit;
import MenuUtilidades.TurnTo.FahreinheitToCelsius;

public class Utilidades {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean execute = true;

        while (execute) {
            System.out.println(kUtilidade.INITIAL_MESSAGE);

            execute(getUtilidade());
        }
    }

    private static void execute(int utilidade) {
        switch (utilidade) {
            case 1:
                new Calculadora();
                break;
            case 2:
                new CelsiusToFahrenheit();
                break;
            case 3:
                new FahreinheitToCelsius();
                break;
            case 4:
                new Hipotenusa();
                break;
            case 5:
                new Altura();
                break;
            case 6:
                new Area();
                break;
            case 7: 
                new TriArea();
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }
    }

    private static int getUtilidade() {
        return scan.nextInt();
    }
}