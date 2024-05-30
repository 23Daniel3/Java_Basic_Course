package AulaPratica2;

public class ClientePF extends Cliente{

    //Crio a instância cpf para um cliente pessoa-física
    private String cpf;

    //Crio o método construtor que herda o nome e o endereço da classe pai - 'Cliente'
    public ClientePF(String nome, String endereco, String cpf){
        super(nome, endereco);
        this.cpf = cpf;
    }

    //Crio o método get que retorna o cpf
    public String getCPF(){
        return cpf;
    }

    //Crio o método set para definir o cpf por outra classe
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
}
