/**
 * This is a NumericQuestion object and its various properties and methods
 */
public class NumericQuestion extends Question {
    //Instance data
    private double tolerance;

    /**
     * Constructor for NumericQuestion
     * @param question - a string containing the question
     * @param answer - a string containing the answer
     * @param difficulty - an int representing the difficulty
     * @param tolerance - a double representing the allowed tolerances
     */
    public NumericQuestion(String question, String answer, int difficulty, double tolerance) {
        super(question, answer, difficulty);
        this.tolerance = tolerance;
    }

    /**
     * This method checks if the answer is correct with allowances for a range of error
     * @param attemptedAnswer - a string entered by the user that contains the attempted answer by the user
     * @return true if the attempted answer is within the allowed tolerance range from the correct answer, false otherwise
     */
    public boolean isCorrect(String attemptedAnswer) {
        if(attemptedAnswer == null) {
            return false;
        }
        double attempt = Double.parseDouble(attemptedAnswer);
        double correct = Double.parseDouble(getAnswer());

        if(attempt >= correct - tolerance && attempt <= correct + tolerance) {
            return true;
        }
        return false;
    }
}
