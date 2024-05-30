package AulaPratica1;

public class Pessoa{

    // Crio as instâncias
    private int código;
    private String nome;

    //Crio o método construtor que usa o mesmo nome da classe
    public Pessoa(int código, String nome){
        this.código = código;
        this.nome = nome;

    }

    //Crio o método get que retorna o nome
    public String getNome(){
        return nome;
    }

    //Crio o método get que retorna o código
    public int getCode(){
        return código;
    }

    //Crio o método set para definir o código por outra classe
    public void setCode(int code){
        this.código = code;
    }
    
    //Crio o método set para definir o nome por outra classe
    public void setNome (String nome){
        this.nome = nome;
    }
}