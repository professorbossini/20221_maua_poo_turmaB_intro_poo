import static javax.swing.JOptionPane.showInputDialog;
public class TesteLivroDeNotas {
    public static void main(String[] args) {
        String nomeDaDisciplina = showInputDialog("Digite o nome da disciplina");
        LivroDeNotas.exibirMensagem(nomeDaDisciplina);
        // LivroDeNotas livroDeNotas;
        // livroDeNotas = new LivroDeNotas();
        // livroDeNotas.exibirMensagem(nomeDaDisciplina);


    }
}
