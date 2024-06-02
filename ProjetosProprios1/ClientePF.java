package ProjetosProprios1;

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

    public String toString(){
        return super.toString() + "CPF: " + cpf;
    }
}  //javadoc -classpath . -d doc *.java
    //cd "C:\Users\danie\OneDrive\Área de Trabalho\Programacao\Java_basic_course\JavacourseUdemy\ProjetoCalculadora\"
// javadoc -classpath \Users\danie\OneDrive\Área de Trabalho\Programação\Java_basic_course\Java course Udemy\ProjetoCalculadora\ -sourcepath Users\danie\OneDrive\Área de Trabalho\Programação\Java_basic_course\Java course Udemy\ProjetoCalculadora\
//cd "C:\Users\danie\OneDrive\Área de Trabalho\Programacao\Java_basic_course\JavacourseUdemy\ProjetoCalculadora\Operacoes\"