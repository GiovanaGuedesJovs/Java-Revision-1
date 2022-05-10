package Professor.Atividade_1;

public class Main {
    public static void main(String[] args) throws Exception {

        Jogador jogador = new Jogador(15.5, "Messi",true);
        System.out.println("\nNome do jogador: " + jogador.getNome() + "\nPontuação do jogador: " + jogador.getPontuacao() + "\nJogador está ativado? " + jogador.isAtivado() + "\n");
    }
}
