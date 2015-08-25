import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * QuestionA unit tests.
 *
 * @author Mauricio Klein
 * @version 1.0
 * @since 2015-08-04
 */
public class QuestionATest {
    @Test
    public void testStream1() {
        Stream input = new InputStream("The angry dog was red. And the cat was angry too.");
        String lastRepeatedWord = QuestionA.lastRepeated(input);
        assertNotNull(lastRepeatedWord);
        assertEquals(lastRepeatedWord, "angry");
    }

    @Test
    public void testStream2() {
        Stream input = new InputStream("The angry dog was red. And red was the angry dog.");
        String lastRepeatedWord = QuestionA.lastRepeated(input);
        assertNotNull(lastRepeatedWord);
        assertEquals(lastRepeatedWord, "dog");
    }

    @Test
    public void testStream3() {
        Stream input = new InputStream("The angry dog was red.");
        String lastRepeatedWord = QuestionA.lastRepeated(input);
        assertNull(lastRepeatedWord);
    }
}