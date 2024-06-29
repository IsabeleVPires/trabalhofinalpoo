import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JogoDaForca {
    private PalavraSecreta palavraSecreta;
    private int tentativasRestantes;
    private ArrayList<Character> letrasIncorretas;
    private Set<Character> letrasTentadas;

    public JogoDaForca() {
        palavraSecreta = new PalavraSecreta();
        tentativasRestantes = 6;
        letrasIncorretas = new ArrayList<>();
        letrasTentadas = new HashSet<>();
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        while (tentativasRestantes > 0 && !palavraSecreta.palavraDescoberta().equals(palavraSecreta.getPalavra())) {
            System.out.println("-------------------------------"); // Linha de separação
            System.out.println("Palavra: " + palavraSecreta.palavraDescoberta());
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.println("Letras incorretas: " + letrasIncorretas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            if (letrasTentadas.contains(letra)) {
                System.out.println("Você já tentou essa letra! Tente novamente.");
                continue; // Volta para o início do loop
            }

            letrasTentadas.add(letra);

            if (!palavraSecreta.adivinharLetra(letra)) {
                System.out.println("Letra errada!");
                tentativasRestantes--;
                letrasIncorretas.add(letra);
            } else {
                System.out.println("Letra correta!");
            }
        }

        System.out.println("-------------------------------"); // Linha de separação final

        if (palavraSecreta.palavraDescoberta().equals(palavraSecreta.getPalavra())) {
            System.out.println("Parabéns! Você venceu. A palavra era: " + palavraSecreta.getPalavra());
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta.getPalavra());
        }

        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Jogo da Forca!");
        JogoDaForca jogo = new JogoDaForca();
        jogo.jogar();
    }
}
