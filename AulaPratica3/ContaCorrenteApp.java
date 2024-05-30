package AulaPratica3;

public class ContaCorrenteApp {

    public static void main(String[] args){

        //Instancio os valores às devidas contas
        ContaCorrente contaComum = new ContaCorrente(123, 456);
        ContaCorrente contaEspecial = new ContaCorrente(124, 456, 1000.00f);
    }
}
