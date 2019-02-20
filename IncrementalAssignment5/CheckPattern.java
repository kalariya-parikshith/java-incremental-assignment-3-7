package com.parikshith.assignment.main;
import com.sun.istack.internal.NotNull;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.logging.Logger;

class Main {
    private static Logger logger = Logger.getLogger("checkPattern log");
    private static final Pattern pattern = Pattern.compile("^[A-Z].*[.]$");

    /**
     * checks if the given sentence matches with required pattern
     *
     * @param 	sentence input non null string to be checked against pattern
     *
     * @return 	true 	if sentence matches with the pattern
     * 			false	else
     */
    private static boolean isPatternMatched(@NotNull String sentence) {
        Matcher matcher = pattern.matcher(sentence);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String[] testSentences = {"Ab.", "ab.", "Abc", "abc.", "a.", "A.", "aB.a", ".", "", null};

        for(String sentence: testSentences) {
            if(sentence == null){
                logger.info("sentence cannot be null");
            } else {
                if (isPatternMatched(sentence)) {
                    logger.info("'" + sentence + "' matches as per the pattern");
                } else {
                    logger.info("'" + sentence + "' doesn't match as per the pattern");
                }
            }
        }
    }
}
