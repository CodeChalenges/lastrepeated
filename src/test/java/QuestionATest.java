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
        assertEquals(lastRepeatedWord, "angry");
    }

    @Test
    public void testStream2() {
        Stream input = new InputStream("The angry dog was red. And red was the angry dog.");
        String lastRepeatedWord = QuestionA.lastRepeated(input);
        assertEquals(lastRepeatedWord, "dog");
    }

    @Test
    public void testStream3() {
        Stream input = new InputStream("The angry dog was red, and the angry cat was red too.");
        String lastRepeatedWord = QuestionA.lastRepeated(input);
        assertEquals(lastRepeatedWord, "red");
    }

    @Test
    public void testStream4() {
        Stream input = new InputStream("The angry dog was red.");
        String lastRepeatedWord = QuestionA.lastRepeated(input);
        assertNull(lastRepeatedWord);
    }

    @Test
    public void testStream5() {
        Stream input = new InputStream("    ");
        String lastRepeatedWord = QuestionA.lastRepeated(input);
        assertNull(lastRepeatedWord);
    }

    @Test
    public void testStream6() {
        Stream input = new InputStream("");
        String lastRepeatedWord = QuestionA.lastRepeated(input);
        assertNull(lastRepeatedWord);
    }
}
