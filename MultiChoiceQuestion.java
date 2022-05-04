import java.util.ArrayList;

/**
 * This is a MultiChoiceQuestion object and its various properties and methods
 *
 * @author png07
 */
public class MultiChoiceQuestion extends Question{
    //Instance data
    ArrayList<String> choices;

    /**
     * Constructor for MultiChoiceQuestion object, initializes the ArrayList choices as well
     * @param question - a string containing the question
     * @param difficulty - an int representing the difficulty
     */
    public MultiChoiceQuestion(String question, int difficulty) {
        super(question, "", difficulty);
        this.choices = new ArrayList<String>();
    }

    /**
     * This method add choices for the question into the arraylist, and sets the answer to be a string containing all the correct choices
     * @param answer - a string containing an answer that might be correct or wrong
     * @param correct - a boolean that determines if the answer is correct of wrong
     */
    public void addChoice(String answer, boolean correct) {
        if(correct) {
            choices.add(answer + " @");
        }
        else {
            choices.add(answer);
        }
        String answerString = "";
        for(int i = 0; i < choices.size(); i++) {
            if(choices.get(i).charAt(choices.get(i).length() - 1) == '@') {
                answerString += "" + (i + 1);
            }
        }
        setAnswer(answerString);
        
    }

    /**
     * This method returns a string containing the question, difficulty, and all the choices given
     * @return a string containing the question, difficulty, and all the choices given
     */
    public String display() {
        String result = super.display() + "\n";
        for(int i = 0; i < choices.size(); i++) {
            if(choices.get(i).charAt(choices.get(i).length() - 1) == '@') {
                result += (i + 1) + ". " + choices.get(i).substring(0, choices.get(i).length() - 1) + "\n";
            }
            else {
                result += (i + 1) + ". " + choices.get(i) + "\n";
            }
        }
        result += "Enter all correct choices. For example, if you think 1 and 2 are correct enter 12";
        return result;
    }
}
