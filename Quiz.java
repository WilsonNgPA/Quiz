import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is a Quiz object with its various properties and methods
 */
public class Quiz {
	//Properties of quiz object
	private ArrayList<Question> questionList;
	private int score;
	public static int totalQuizzes = 0;

	/**
	 * This is a constructor for quiz object that initialize an ArrayList<Question> and score.
	 * totalQuizzes is incremented whenever the constructor is used to create a new quiz
	 */
	public Quiz() {
		questionList = new ArrayList<Question>();
		this.score = 0;
		totalQuizzes++;
	}

	/**
	 * This method retrieves the score obtained for a quiz
	 * @return an int which is the score achieved. Returns 0 if quiz has not been attempted
	 */
	public int getScore() {
		return score;
	}

	/**
	 * This method retrieves the total number of quiz object created
	 * @return an int which is the total number of quiz object created. If no quiz object is created, returns 0
	 */
	public static int getTotalQuizzes() {
		return totalQuizzes;
	}

	/**
	 * This method adds a question to the quiz. If quiz already at 25 questions, question will not be added
	 * @param q - a question object entered by the user to be added to the quiz
	 */
	void add(Question q) {
		if(questionList.size() < 25) {
			questionList.add(q);
		}
		else {
			System.out.println("You have reached the max number of questions allowed in a quiz = 25");
		}
	}

	/**
	 * This method prints out the quiz to the user. The user can then attempt the questions in the quiz.
	 * If user's answer is correct, score will increment
	 * @param min - an int entered by the user that represents the minimum difficulty of questions that will be printed
	 * @param max - an int entered by the user that represents the maximum difficulty of questions that will be printed
	 */
	void giveQuiz(int min, int max) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < questionList.size(); i++) {
			if(questionList.get(i).getDifficulty() >= min && questionList.get(i).getDifficulty() <= max) {
				String answer = "";
				System.out.println(questionList.get(i).display());
				answer = input.nextLine();
				if(answer == null) {
					System.out.println("Incorrect!");
				}
				else if(questionList.get(i).isCorrect(answer)) {
					this.score += 1;
					System.out.println("Correct!");
				}
				else {
					System.out.println("Incorrect!");
				}
			}
		}
		//When the scanner is close, unable to print second quiz: Exception in thread “main” java.util.NoSuchElementException.
		//input.close();
	}

	/**
	 * A default giveQuiz() method if no parameters is defined
	 */
	void giveQuiz() {
		giveQuiz(1, 10);
	}
}
