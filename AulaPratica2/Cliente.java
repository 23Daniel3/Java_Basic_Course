package AulaPratica2;

public class Cliente {
    
    //Crio as instâncias da classe pai
    private String nome;
    private String endereco;

    //Crio o método construtor que inicializa as funções da classe
    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    //Crio o método get que retorna o nome do cliente
    public String getNome(){
        return nome;
    }

    //Crio o método get que retorna o nome do endereço do cliente
    public String getEndereco(){
        return endereco;
    }

    //Crio o método set para definir o nome do cliente por classes filhas
    public void setNome(String nome){
        this.nome = nome;
    }

    //Crio o método set para definir o nome do endereço por classes filhas
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}