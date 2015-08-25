# Last Repeated

Problem proposed by Amazon recruting team to the software engineer role.

Problem Description
-------------------

Find the last repeated word in a stream.  Please note that you are being provided a stream as a source for the characters.  The stream is guaranteed to eventually terminate (i.e. return false from a call to the next() method), though it could be very long.  You will access this stream through the provided interface methods.  A call to hasNext() will return whether the stream contains any more characters to process.  A call to next() will return the next character to be processed in the stream.  It is not possible to restart the stream.

Example 1:
Input:  The angry dog was red. And the cat was angry too.
Output: “angry”

In this example, the last repeated word is “angry”.

Example 2:
	Input: The angry dog was red.
	Output: “”

In this example, there is no repeated word.

Use one of the following skeletons for your solutions.

Java:
package questions;

public interface Stream {
    char next();

    boolean hasNext();
}

public class QuestionA {
    public static String lastRepeated(final Stream input) {
// YOUR CODE
    }
}

C++
class Stream {
public:	
	char next();
	bool hasNext();
};

class QuestionA {
	std::string lastRepeated (Stream &input) {
		// YOUR CODE
	}
};
