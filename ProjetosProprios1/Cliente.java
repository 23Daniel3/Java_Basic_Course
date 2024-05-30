package ProjetosProprios1;

public class Cliente implements ClienteInterface{
    
    //Crio as instâncias da classe pai
    private String nome;
    private String endereco;

    //Crio o método construtor que inicializa as funções da classe
    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    //Uso o método get que retorna o nome do cliente
    public String getNome(){
        return nome;
    }

    @Override
    //Uso o método get que retorna o nome do endereço do cliente
    public String getEndereco(){
        return endereco;
    }

    @Override
    //Uso o método set para definir o nome do cliente por classes filhas
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    //Uso o método set para definir o nome do endereço por classes filhas
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    @Override
    //Uso o conceito de polimorfismo para usar um método de forma a manter maior legibilidade ao código 
    public String toString(){
        return "Nome: " + nome + " Endereço: " + endereco;
    }
}