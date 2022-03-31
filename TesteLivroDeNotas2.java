public class TesteLivroDeNotas2 {
    public static void main(String[] args) {
        LivroDeNotas livro = new LivroDeNotas();
        //livro.nomeDisciplina = "POO";
        String nomeDisciplina = "POO";
        livro.setNomeDisciplina(nomeDisciplina);
        System.out.println(livro.getNomeDisciplina());
        livro.exibirMensagem();
    }
}
