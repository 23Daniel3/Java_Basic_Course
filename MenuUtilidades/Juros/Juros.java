package MenuUtilidades.Juros;

import java.util.Scanner;

public class Juros {

    static Scanner input = new Scanner(System.in);

    public Juros(){

        System.out.println(
            "Digite o tipo de cálculo de juros:\n"
            +"(1) para juros compostos\n"
            +"(2) para juros simples\n"
        );
        
        execute(getCalc());
    }

    private static int getCalc(){
        return input.nextInt();
    }

    private static void execute(int calc) {
        switch (calc) {
            case 1:
                ///wdd
                break;
            case 2:
                new JurosSimples();
                break;
            default:
                //dd
                break;
        }
    }
}
