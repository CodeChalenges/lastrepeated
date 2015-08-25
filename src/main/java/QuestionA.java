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
        String[] words = parseStream(input);

        LinkedHashMap<String, Integer> occurrencesMap = new LinkedHashMap<String, Integer>();

        for (String word : words) {
            if (occurrencesMap.containsKey(word)) {
                // Occurrence found: just increment occurrences accumulator.
                int accumulatedOccurrences = occurrencesMap.get(word);
                occurrencesMap.put(word, accumulatedOccurrences + 1);
            }
            else {
                // No occurrence of current word found.
                // Add this word to map with a single occurrence.
                occurrencesMap.put(word, 1);
            }
        }

        // search for the last key that repeats in map
        String lastOccurrence = null;
        for (String key : words) {
            if (occurrencesMap.get(key) > 1) {
                lastOccurrence = key;
            }
        }

        return lastOccurrence;
    }

    /**
     * Split stream in its words
     *
     * Input:
     *  @param stream a input stream containing words;
     *
     * Output:
     *  @return String[] stream tokenized;
     * */
    private static String[] parseStream(final Stream stream) {
        StringBuffer sb = new StringBuffer();

        while(stream.hasNext()) {
            char nextChar = stream.next();

            // Ignore dots, since they aren't part of words.
            if (nextChar != '.') {
                sb.append(nextChar);
            }
        }

        return sb.toString().split(" ");
    }
}
