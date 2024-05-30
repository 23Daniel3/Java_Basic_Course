package Javapessoafolder;

public class Pessoa{

    private int código;
    private String nome;

    public Pessoa(int código, String nome){
        this.código = código;
        this.nome = nome;

    }

    public String getNome(){
        return nome;
    }

    public int getCode(){
        return código;
    }
}