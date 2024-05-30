package AulaPratica4;

public class ClienteApp {

    //Crion o método main para executar todas as funções
    public static void main(String[] args){
        
        //Defino o nome, endereço e cpf ou cnpj para cada tipo de cliente
        ClientePF clientepf1 = new ClientePF("cacildo", "rua dos fundossss", "12123314");
        ClientePJ clientepj1 = new ClientePJ("Daniel soluções", "rua das frentes", "12948499849489");

        //Imprimo na tela os dados de cada cliente
        System.out.println("Cliente pf é: " + clientepf1.getNome() + 
        "  Endereço é: " + clientepf1.getEndereco() + " CPF é: " + clientepf1.getCPF());

        //Imprimo na tela usando o método toString, que me garante uma melhor legibilidade de código
        System.out.println(clientepj1.toString());
    }
}
