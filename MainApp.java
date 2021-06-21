import java.util.Scanner;
/**
 * A classe MainApp contém métodos para o jogo Caça-palavras, tradicional jogo do estilo passatempo que
 * consiste em achar palavras aleatoriamente postas entre diversas letras em uma grade quadrada.
 * Além de conter métodos para o jogo (que estão definidos na classe Auxiliar), esta classe também contém 
 * o código que possibilita verificar se a jogada do usuário está correta ou não e somar seus pontos, caso acerte.
 * 
 * <p> Você pode ler mais sobre o jogo e suas estratégias neste link: 
 * <a href="https://pt.wikipedia.org/wiki/Ca%C3%A7a-palavras"> Caça-Palavras</a>
 * 
 * <p> @author Morgana Dias Rodrigues
 * <p> @date 18-06-2021
 * <p> @version 1.0
 */
public class MainApp
{
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        // chama o método para ditar as regras do jogo.
        Auxiliar.tutorial();
        // variáveis 
        int jogada;
        int pontos;
        // vetor de 10 posições para criiar o quadro do jogo (board).
        String resposta;
        String[] board;
        do 
        {
            // chama os métodos que preenchem o quadro com as palavras e letras.
            board = Auxiliar.preencher();
            Auxiliar.dump(board);
            // pontos do jogador. Iniciam em zero. Cada jogada certa soma-se mais 1 na variável ponto.
            pontos = 0;
            do
            {
                System.out.println("_____________________________________________");
                System.out.println("Indique a posição da linha da palavra achada: ");
                jogada = entrada.nextInt();
                while(jogada < 0 || jogada > 10)
                {
                    jogada = Auxiliar.verificador(jogada); // método para verificar se a entrada está no intervalo de 0 até 10 (número de linhas no quadro)
                }
                // vetor com as linhas corretas do quadro. Estas são as linhas com as posições corretas das palavras.
                int[] posicao = {1,3,5,6,9};
                // variável para verificar se o jogador acertou ou não acertou a posição da linha.  
                boolean acertou = false;
                for (int i = 0; i < posicao.length; i++)
                {
                    if (posicao[i] == jogada) // se o número que o jogador digitou estiver dentro do vetor, o acertou leva o valor true.
                    {
                        acertou = true;
                        break;
                    }
                }

                if (acertou) // aqui, se o acertou estiver com o valor true, ou seja, o jogador acertou, ele ganha mais um ponto na variável pontos.
                {
                    System.out.println("PARABÉNS!! Você encontrou a palavra " + board[jogada]);
                    System.out.println("_____________________________________________________");
                    pontos = pontos + 1;
                    board[jogada] = "******"; // substui a palavra achada por asteriscos "*".
                    Auxiliar.dump(board); // refaz o quadro, com os asteriscos.
                }
                else // a variável acertou está com o valor false, ou seja, o jogador não acertou.
                {
                    System.out.println("Não há palavras nesta linha.");
                    System.out.println("____________________________");
                }
            } while (pontos < 5); // os pontos vão até 5, pois são 5 palavras para achar. Cada palavra vale um ponto.
            System.out.println("Parabéns! Você encontrou todas as palavras!");
            System.out.println("Você deseja jogar novamente? SIM/NÃO");
            resposta = entrada.next();
        } while (resposta.toLowerCase().equals("sim")); // toda a dinâmica se repete, até o jogador desejar não continuar.
        System.out.println("__________________");
        System.out.println("|===FIM DE JOGO===|");
        System.out.println("__________________");
    }
}
