import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * QuestionA class.
 *
 * @author Mauricio Klein
 * @version 1.0
 * @since 2015-08-04
 */
public class QuestionA {
    /**
     * Idetify the last word that repeat in a given stream.
     *
     * Input:
     *  @param input a stream containing words, in order of appearance;
     *
     * Output:
     *  @return String last word that repeat, or null if not found;
     * */
    public static String lastRepeated(final Stream input) {
        LinkedHashMap<String, Integer> occurrencesMap = new LinkedHashMap<String, Integer>();
        String lastOccurrence = null;
        String word;

        while ((word = getNextWord(input)) != null) {
            if (occurrencesMap.containsKey(word)) {
                // Occurrence found: just increment occurrences accumulator.
                int accumulatedOccurrences = occurrencesMap.get(word);
                occurrencesMap.put(word, accumulatedOccurrences + 1);
                lastOccurrence = word;
            } else {
                // No occurrence of current word found.
                // Add this word to map with a single occurrence.
                occurrencesMap.put(word, 1);
            }
        }

        return StringUtils.isNotBlank(lastOccurrence) ? lastOccurrence : null;
    }

    /**
     * Get next word on stream
     *
     * Input:
     *  @param stream a input stream containing words;
     *
     * Output:
     *  @return String next word;
     *          null, if there isn't word left to process;
     * */
    private static String getNextWord(final Stream stream) {
        StringBuilder sb = new StringBuilder();

        if (!stream.hasNext()) {
            return null;
        }

        while (stream.hasNext()) {
            char nextChar = stream.next();

            // Space found: new word formed
            if (nextChar == ' ') {
                break;
            }

            // Ignore dots and commas, since they aren't part of words.
            if (!Arrays.asList('.', ',').contains(nextChar)) {
                sb.append(nextChar);
            }
        }

        return sb.toString();
    }
}
