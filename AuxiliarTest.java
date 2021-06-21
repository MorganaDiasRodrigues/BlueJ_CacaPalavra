
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste AuxiliarTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class AuxiliarTest
{
    /**
     * Construtor default para a classe de teste AuxiliarTest
     */
    public AuxiliarTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testePreencher()
    {
        String[] board;
        board = Auxiliar.preencher();
        assertEquals(6, board[0].length());
        assertEquals(11, board.length);
    }
}
