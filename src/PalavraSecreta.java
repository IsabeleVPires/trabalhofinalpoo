class PalavraSecreta {
    private static final String[] PALAVRAS = {"GATO", "CACHORRO", "ELEFANTE", "LEAO", "TIGRE", "ZEBRA", "MACACO", "JOGADOR", "FOCA", "TOMATE", "LARANJA", "MAÇA", "CABRA", "ÁGUA", "PORTA", "JANELA", "ELEVADOR"};
    private String palavra;
    private StringBuilder palavraDescoberta;

    public PalavraSecreta() {
        palavra = escolherPalavra();
        palavraDescoberta = new StringBuilder("_".repeat(palavra.length()));
    }

    private String escolherPalavra() {
        return PALAVRAS[(int) (Math.random() * PALAVRAS.length)];
    }

    public boolean adivinharLetra(char letra) {
        boolean acertou = false;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                palavraDescoberta.setCharAt(i, letra);
                acertou = true;
            }
        }
        return acertou;
    }

    public String palavraDescoberta() {
        return palavraDescoberta.toString();
    }

    public String getPalavra() {
        return palavra;
    }
}

