import java.util.Scanner;
/**
 * A classe {@code Auxiliar} é a superclasse que define os métodos responsáveis por determinadas partes do jogo Caça-palavras. Contém no total
 * 4 métodos diferentes que são utilizados na classe MainApp. Estes métodos incluem um tutorial para o jogador, o preenchimento e 
 * aprimoramento da visualização do quadro de palavras e também uma verificação da entrada obtida pelo jogador.
 * 
 * <p> Você pode ler mais sobre o jogo e suas estratégias neste link: 
 * <a href="https://pt.wikipedia.org/wiki/Ca%C3%A7a-palavras"> Caça-Palavras</a>
 * 
 * <p> @author Morgana Dias Rodrigues
 * <p> @date 18-06-2021
 * <p> @version 1.0
 */
public class Auxiliar
{
    /**
     * 
     * Este método, quando chamado, mostra na tela do usuário
     * as instruções para jogar o jogo Caça-palavras.
     * Este método é void, portanto, não retorna nada.
     * Este método não necessita de parâmetros.
     */
    public static void tutorial()
    {
        System.out.println("=== CAÇA-PALAVRAS ===");
        System.out.println("_______________________________________________________________________________________");
        System.out.println("Bem-vindo(a)!");
        System.out.println("Como jogar: ");
        System.out.println("- Há cinco palavras escondidas horizoltamente no quadro abaixo.");
        System.out.println("- Cada palavra está em uma linha do quadro. Cada linha do quadro está em uma posição.");
        System.out.println("- A primeira linha inicia na posição 0 (zero), a segunda linha na posição 1, e assim por diante.");
        System.out.println("- A última linha se encontra na posição 10.");
        System.out.println("- Estas palavras estão relacionadas com a linguagem de programação JAVA.");
        System.out.println("- Indique a posição correspondente à linha da palavra achada.");
        System.out.println("- Não esqueça: as linhas iniciam na posição 0 (zero) e vão até a posição 10.");
        System.out.println("BOA SORTE! :D ");
        System.out.println("_______________________________________________________________________________________");
    }

    /**
     * Este método é responsável por preencher as 10 posições do vetor (que será o quadro do jogo) já criado na classe MainApp.
     * Cada posição recebe ou uma palavra para procurar ou letras aleatórias.
     * Note que os vetores de posição 1,3,5,6 e 9 são os que contém as palavras que devem ser procuradas pelo usuário.
     * Este método é void, portanto, não retorna nada.
     * 
     * @param string[] board vetor de 10 posições criado para ser o quadro do caça-palavras
     */
    public static void preencher(String[] board)
    {
        board[0] = "FEUVBF";
        board[1] = "CLASSE";
        board[2] = "PIGHZW";
        board[3] = "LOGICA";
        board[4] = "PUMCOL";
        board[5] = "STRING";
        board[6] = "OBJETO";
        board[7] = "BLUPET";
        board[8] = "TEDJSL";
        board[9] = "METODO";
        board[10] = "JASCUV";
    }

    /**
     * Este método, a partir do quadro já preenchido pelo método preencher(), aprimora a visualização dele.
     * Cada vez que ele mostra na tela um caractere que está no vetor em determinada posição, ele adiciona 
     * um espaço em branco entre cada letra. Assim, a visualização do quadro se torna mais limpa.
     * 
     * @param string[] board vetor de 10 posições criado para ser o quadro do caça-palavras
     */
    public static void dump(String[] board)
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length(); j++)
            {
                System.out.print(board[i].charAt(j) + " "); // pega o caracter na posiçao j e mostra junto um espaço em branco.
            }
            System.out.println();
        }
    }

    /**
     * Este método é responsável por fazer a verificação da entrada feita pelo jogador.
     * Assim, enquanto o jogador digitar um valor fora do intervalo permitido, o método
     * mostra na tela instruções para o usuário digitar novamente o valor desejado e
     * recebe este valor na variável jogada_certa.
     * 
     * @param jogada_certa recebe uma entrada do usuário que é a posição que ele encontrou a palavra no quadro
     * @return o valor recebido na variável jogada_certa
     */
    public static int verificador(int jogada_certa)
    {
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("______________________________________________________");
        System.out.println("Você digitou um valor inválido! Lembre-se:");
        System.out.println("As linhas variam da posição 0 (zero) até a posição 10.");
        System.out.println("______________________________________________________");
        System.out.println("Digite novamente: ");
        jogada_certa = entrada.nextInt();
        entrada.close();
        return jogada_certa;
    }
}