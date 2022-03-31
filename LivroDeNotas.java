//alta coesão
public class LivroDeNotas{

    //variável de instância
    //instância é sinônimo de objeto
    //private é um modificador de acesso
    //estamos implementando o encapsulamento
    //usando private
    private String nomeDisciplina;

    //método modificador
    //setter
    public void setNomeDisciplina(String n){
        if (n.length() >= 3)
            nomeDisciplina = n;
    }

    //método de acesso
    //getter
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }


    public void exibirMensagem(){
        System.out.println("Bem vindo ao livro de notas da disciplina" + nomeDisciplina);
    }
}