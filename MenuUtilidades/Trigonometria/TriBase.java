package MenuUtilidades.Trigonometria;

import java.util.Scanner;

public class TriBase {

    protected double base1;

     Scanner input = new Scanner(System.in);

    public TriBase(int triOper){
        System.out.println("Digite a base:");
        base1 = input.nextDouble();
    }
}
