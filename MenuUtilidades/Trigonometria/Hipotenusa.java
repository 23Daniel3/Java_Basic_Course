package MenuUtilidades.Trigonometria;

public class Hipotenusa extends TriBase{

    public Hipotenusa(int triOper){
        super(triOper);
        System.out.println("Digite a segunda base:");
        double base2 = input.nextDouble();
        double result = Math.sqrt(Math.pow(base1, 2) + Math.pow(base2, 2));
        System.out.println("A hipotenusa é: " + result);
    }
}
