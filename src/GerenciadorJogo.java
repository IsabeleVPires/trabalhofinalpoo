class GerenciadorJogo {
    private static final String[] PALAVRAS = {"GATO", "CACHORRO", "ELEFANTE", "LEAO", "TIGRE", "ZEBRA", "MACACO", "JOGADOR", "FOCA", "TOMATE", "LARANJA", "MAÇA", "CABRA", "ÁGUA", "PORTA", "JANELA", "ELEVADOR"};
    private JogoDaForca jogo;

    public GerenciadorJogo() {
        jogo = new JogoDaForca();
    }

    public void jogar() {
        jogo.jogar();
    }
}