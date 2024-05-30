package AulaPratica2;

public class ClientePJ extends Cliente {

    //Crio a instância cnpj para um cliente pessoa-jurídica
    private String cnpj;

    //Crio o método construtor que herda o nome e o endereço da classe pai - 'Cliente'
    public ClientePJ(String nome, String endereco, String cnpj){
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    //Crio o método get que retorna o cnpj
    public String getCNPJ(){
        return cnpj;
    }

     //Crio o método set para definir o cnpj por outra classe
    public void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }

}
