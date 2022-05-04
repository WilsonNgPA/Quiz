/**
 * This is a FillInQuestion object and its various properties and methods
 *
 * @author png07
 */
public class FillInQuestion extends Question {
    /**
     * Constructor for FillInQuestion
     * @param state - a string containing the question and answer in the specified format
     * @param difficulty - an int representing the difficulty of the question
     */
    public FillInQuestion(String state, int difficulty) {
        super(state, "", difficulty);
        String answer = "";
        String question = "";
        for(int i = 0; i < state.length(); i++) {
            if(state.charAt(i) == '_') {
                i++;
                while(state.charAt(i) != '_' && i < state.length()) {
                    answer += state.charAt(i);
                    question += '_';
                    i++;
                }
            }
            question += state.charAt(i);

        }
        setAnswer(answer);
        setQuestion(question);
    }
}
