/**
 * InputStream class.
 *
 * @author Mauricio Klein
 * @version 1.0
 * @since 2015-08-24
 * */
public class InputStream implements Stream {
    private String phrase;
    private Integer currentChar;

    public InputStream(String phrase) {
        this.phrase = phrase;
        this.currentChar = 0;
    }

    public char next() {
        return phrase.charAt(currentChar++);
    }

    public boolean hasNext() {
        return currentChar < phrase.length();
    }
}
