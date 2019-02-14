import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.logging.Logger;

class CheckPattern {
	private static Logger logger = Logger.getLogger("checkPattern log");
	private static final Pattern pattern = Pattern.compile("^[A-Z].*[.]$");

	/**
	 * checks if the given sentence matches with required pattern
	 * 
	 * @param 	sentence input string to be checked against pattern
	 * 
	 * @throws 	NullPointerException if the given sentence in the argument
	 * 			is null.
	 * @return 	true 	if sentence matches with the pattern
	 * 			false	else
	 */
	public static boolean isPatternMatched(String sentence) throws NullPointerException {
		Matcher matcher = pattern.matcher(sentence);
		return matcher.matches();
	}

	public static void main(String[] args) {

		String[] testSentences = {"Ab.", "ab.", "Abc", "abc.", "a.", "A.", "aB.a", ".", "", null};

		for(String sentence: testSentences) {
			try {
				if(isPatternMatched(sentence)) {
					logger.info("'"+sentence+"' matches as per the pattern");
				} else {
					logger.info("'"+sentence+"' doesn't match as per the pattern");
				}
			} catch(NullPointerException e) {
				logger.info("null was passed as argument to isPatternMatched method");
			}
		}
	}
}
