package Aluno.Atividade_1;

public class Main {
    public static void main(String[] args) throws Exception {

        Livro livro = new Livro(1949, "1984", "George Orwell");

        System.out.println("\nNome do livro: " + livro.getTitulo() + "\nAutor do livro: " + livro.getAutor()
                + "\nAno de lançamento do livro: " + livro.getAno() + "\n");

    }
}
