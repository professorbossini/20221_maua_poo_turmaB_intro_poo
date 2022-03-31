import static javax.swing.JOptionPane.showInputDialog;
public class TesteLivroDeNotas {
    public static void main(String[] args) {
        String nomeDaDisciplina = showInputDialog("Digite o nome da disciplina");
        LivroDeNotas livroDeNotas;
        livroDeNotas = new LivroDeNotas();
        livroDeNotas.nomeDaDisciplina = nomeDaDisciplina;
        livroDeNotas.exibirMensagem();


        LivroDeNotas livroDeNotas2 = new LivroDeNotas();

        //syntax
        livroDeNotas2.nomeDaDisciplina = nomeDaDisciplina;

        livroDeNotas.nomeDaDisciplina = "Java";

        livroDeNotas2.nomeDaDisciplina = "Português";

        nomeDaDisciplina = showInputDialog("Outra disciplina, por favor");
        
        //System.gc();

        // while (true){
        //     new LivroDeNotas();
        // }

    }
}
