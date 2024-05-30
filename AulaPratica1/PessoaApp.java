package AulaPratica1;

public class PessoaApp {

    //Crio o método main que executa todas as funções
    public static void main(String[] args){

        //Chamo o método Pessoa e defino o código e o nome
        Pessoa pessoa1 = new Pessoa(1, "Daniel");

        //Imprimo os dados anteriores
        System.out.println("o nome do objeto global é: " + pessoa1.getNome() + " Código" + pessoa1.getCode());

        //Re-defino o nome e o código usando o set
        pessoa1.setNome("Danielo");
        pessoa1.setCode(2);

        //Imprimo os novos dados
        System.out.println("O nome correto é: " + pessoa1.getNome() + " Código" + pessoa1.getCode());
    }
}
