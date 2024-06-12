package MenuUtilidades.Juros;

import java.util.Scanner;

import MenuUtilidades.Constants.Kinvalid;
import MenuUtilidades.Constants.kJuros;

public class JurosSimples {

    Scanner input = new Scanner(System.in);

    private double juros;
    private double tempo;
    private double taxa;
    private double capital;

    private double result;

    public JurosSimples(){
        System.out.println(kJuros.MESSAGE);
        execute(getUtilidade());
    }

    private void execute(int type){
        switch (type) {
            case 1:
            Juros();
                break;
            case 2:
                Tempo();
                break;
            case 3:
                Taxa();
                break;
            case 4:
                Capital();
                break;
            default:
                System.out.println(Kinvalid.invOper);
                break;
        }
    }
    private void Juros(){
        getCapital();
        getTaxa();
        getTempo();

        result = taxa * capital * tempo / 100;
        System.out.println("Os juros são: " + result);
    }

    private void Tempo(){
        getCapital();
        getTaxa();
        getJuros();

        result = (juros * 100) / (capital * taxa);
        System.out.println("O tempo é: " + result + " na grandeza de tempo da taxa");
    }

    private void Taxa(){
        getCapital();
        getTempo();
        getJuros();

        result = (juros * 100) / (capital * tempo);
        System.out.println("A taxa é: " + result + " % na grandeza do tempo");
    }

    private void Capital(){
        getTaxa();
        getTempo();
        getJuros();

        result = (juros * 100) / (taxa * tempo);
        System.out.println("O capital é: " + result);
    }

    private void getJuros(){
        System.out.println("digite os juros");
        juros = input.nextDouble();
    }

    private void getTempo(){
        System.out.println("digite o tempo (na mesma grandeza da taxa 'mês ou ano')");
        tempo = input.nextDouble();
    }

    private void getTaxa(){
        System.out.println("digite a taxa");
        taxa = input.nextDouble();
    }

    private void getCapital(){
        System.out.println("digite o Capital");
        capital = input.nextDouble();
    }

    private int getUtilidade(){
        return input.nextInt();
    }
}
