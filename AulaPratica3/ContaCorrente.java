package AulaPratica3;

public class ContaCorrente {

    //Crio as instâncias
    private int numero, agencia;
    private float limite;

    //Usando o conceito de sobrecarga para criar 2 métodos construtores, permitindo instanciar objetos de várias formas
    public ContaCorrente(int numero, int agencia){
        this.numero = numero;
        this.agencia = agencia;
    }

    public ContaCorrente(int numero, int agencia, float limite){
        this.numero = numero;
        this.agencia = agencia;
        this.limite = limite;
    }

    //Uso método get para retornar os valores
    public int getNumero(){
        return numero;
    }

    public int getAgencia(){
        return agencia;
    }

    public float getLimite(){
        return limite;
    }

    //Uso o método set para definir os valores na classe 'app'
    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }
}
