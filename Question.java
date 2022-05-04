/**
 * This is a Question object with its various properties and methods
 *
 * @author png07
 *
 */
public class Question {
	//Properties of Question object
	private String question, answer;
	private int difficulty;

	/**
	 * This is the constructor for the question object
	 * @param question - a string entered by the user containing the question
	 * @param answer - a string entered by the user containing the answer
	 * @param difficulty - an int entered by the user representing difficulty of the question
	 */
	public Question(String question, String answer, int difficulty) {
		this.question = question;
		this.answer = answer;
		setDifficulty(difficulty);
	}

	/**
	 * This is the default constructor for the question object if no difficulty is specified
	 * @param question - a string entered by the user containing the question
	 * @param answer - a string entered by the user containing the answer
	 */
	public Question(String question, String answer) {
		this(question, answer, 1);
	}

	/**
	 * This is a method that retrieves the question and returns it
	 * @return a string containing the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * This is a method that sets the question property of the object to the input
	 * @param question - a string entered by the user containing the question
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * This is a method that retrieves the answer and returns it
	 * @return answer - a string containing the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * This is a method that sets the answer property of the object to the input
	 * @param answer - a string entered by the user containing the answer
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * This is a method that retrieves and return the difficulty
	 * @return an int representing the difficulty of the question
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * This is a method that sets the difficulty property of the object to the input
	 * If difficulty entered is less than 1, difficulty defaults to 1
	 * If difficulty entered is more than 10, difficulty defaults to 10
	 * @param difficulty - an int entered by the user representing the difficulty
	 */
	public void setDifficulty(int difficulty) {
		if(difficulty < 1) {
			this.difficulty = 1;
		}
		else if(difficulty > 10) {
			this.difficulty = 10;
		}
		else {
			this.difficulty = difficulty;
		}
	}

	/**
	 * This is a method that returns the question, answer and difficulty as a string
	 * @return a string containing the question, answer and difficulty properties of the object
	 */
	public String toString() {
		return question + " " + answer + " " + difficulty;
	}

	/**
	 * This is a method that check if the attempted answer is correct or not
	 * @param attemptedAnswer - a string entered by the user that contains the attempted answer by the user
	 * @return
	 */
	public boolean isCorrect(String attemptedAnswer) {
		if(attemptedAnswer == null) {
			return false;
		}
		if(attemptedAnswer.toUpperCase().equals(answer.toUpperCase())) {
			return true;
		}
		return false;
	}

	/**
	 * This method returns a string containing the question and difficulty
	 * @return a string containing the question and difficulty
	 */
	public String display(){
		return question + " (Difficulty: " + difficulty + ")";
	}
	
}
