package ProjetosProprios1;

//Crio uma interface para a classe pai, onde crio os métodos de forma a garantir o uso
public interface ClienteInterface {

    public String getNome();

    public String getEndereco();

    public void setNome(String nome);

    public void setEndereco(String endereco);

    public String toString();
}
