import javax.swing.plaf.multi.MultiOptionPaneUI;

/**
 * This is a tester for the quiz and question object
 *
 * @author png07
 */
public class QuizTime {
	public static void main(String[] args) {
		//Creating multichoice questions and adding the multiple choices
		MultiChoiceQuestion qe1 = new MultiChoiceQuestion("What is the largest planet in our Solar System", 5);
		qe1.addChoice("Earth", false);
		qe1.addChoice("Mars", false);
		qe1.addChoice("Jupiter", true);
		qe1.addChoice("Pluto", false);
		MultiChoiceQuestion qe2 = new MultiChoiceQuestion("What are the correct colors of ants", 3);
		qe2.addChoice("Black", true);
		qe2.addChoice("Green", true);
		qe2.addChoice("Orange", true);
		qe2.addChoice("Red", true);
		MultiChoiceQuestion qe3 = new MultiChoiceQuestion("Which cities are in British Columbia", 1);
		qe3.addChoice("Vancouver", true);
		qe3.addChoice("Singapore", false);
		qe3.addChoice("Richmond", true);
		qe3.addChoice("Malaysia", false);

		//Creating quiz e and adding the multichoice questions
		Quiz quize = new Quiz();
		quize.add(qe1);
		quize.add(qe2);
		quize.add(qe3);

		//Creating numeric questions
		NumericQuestion qd1 = new NumericQuestion("17.2 - 15.1", "2.1", 5, 0.1);
		NumericQuestion qd2 = new NumericQuestion("10.5 + 11.5", "22", 2, 0.2);
		NumericQuestion qd3 = new NumericQuestion("60.1 + 0.5", "60.6", 5, 1);

		//Creating quiz d and adding the numeric questions
		Quiz quizd = new Quiz();
		quizd.add(qd1);
		quizd.add(qd2);
		quizd.add(qd3);

		//Creating fill in questions
		FillInQuestion qc1 = new FillInQuestion("The color _white_ is the most common color found on flags.", 5);
		FillInQuestion qc2 = new FillInQuestion("Roses are _red_.", 2);
		FillInQuestion qc3 = new FillInQuestion("Violets are _blue_.", 3);

		//Creating quiz c and adding fill in questions
		Quiz quizc = new Quiz();
		quizc.add(qc1);
		quizc.add(qc2);
		quizc.add(qc3);

		//Creating questions for quiz a
		Question qa1 = new Question("What color is Mars?", "red", 5);
		Question qa2 = new Question("What color is the sky?", "blue", 1);
		Question qa3 = new Question("What color is the grass?", "green", 1);
		Question qa4 = new Question("What color is the sun?", "yellow", 2);
		Question qa5 = new Question("What color is an orange?", "orange", 1);
		Question qa6 = new Question("What color is the ocean?", "clear", 10);
		Question qa7 = new Question("Pepsi or Coke?", "coke", 5);

		//Creating quiz a and adding questions
		Quiz quiza = new Quiz();
		quiza.add(qa1);
		quiza.add(qa2);
		quiza.add(qa3);
		quiza.add(qa4);
		quiza.add(qa5);
		quiza.add(qa6);
		quiza.add(qa7);

		//Creating questions for quiz b
		Question qb1 = new Question("10 * 4 = ?", "40", 2);
		Question qb2 = new Question("1 + 1 = ?", "2", 1);
		Question qb3 = new Question("7/3 = ?", "2", 3);
		Question qb4 = new Question("6 - 7 = ?", "-1", 4);
		Question qb5 = new Question("3! = ?", "6", 7);
		Question qb6 = new Question("cos(0) = ?", "1", 6);
		Question qb7 = new Question("sin(0) = ?", "0", 6);
		Question qb8 = new Question("ln(1) = ?", "0", 5);
		Question qb9 = new Question("ln(0) = ?", "undefined", 10);
		Question qb10 = new Question("ln(e) = ?", "1", 9);
		Question qb11 = new Question("6/2 + 1 = ?", "4", 8);
		Question qb12 = new Question("6/(2 + 1) = ?", "2", 7);
		Question qb13 = new Question("10/3 - 6 = ?", "-3", 10);
		Question qb14 = new Question("5*4/2 - 7 = ?", "3", 9);
		Question qb15 = new Question("1/0 = ?", "undefined", 5);
		Question qb16 = new Question("9 - 7%2 = ?", "8", 2);
		Question qb17 = new Question("1 - (7 - 9) = ?", "3", 1);
		Question qb18 = new Question("sin^2(x) + cos^2(x) = ?", "1", 8);
		Question qb19 = new Question("sec^2(x) - tan^2(x) = ?", "1", 4);
		Question qb20 = new Question("csc^2(x) - cot^2(x) = ?", "1", 5);
		Question qb21 = new Question("sin(x)/cos(x) - tan(x) = ?", "0", 10);
		Question qb22 = new Question("sin(-x) + sin(x) = ?", "0", 9);
		Question qb23 = new Question("tan(-x) + tan(x) = ?", "0", 8);
		Question qb24 = new Question("cos(-x) - cos(x) = ?", "0", 7);
		Question qb25 = new Question("e^(ln(1)) = ?", "1", 3);

		//Creating quiz b and adding questions
		Quiz quizb = new Quiz();
		quizb.add(qb1);
		quizb.add(qb2);
		quizb.add(qb3);
		quizb.add(qb4);
		quizb.add(qb5);
		quizb.add(qb6);
		quizb.add(qb7);
		quizb.add(qb8);
		quizb.add(qb9);
		quizb.add(qb10);
		quizb.add(qb11);
		quizb.add(qb12);
		quizb.add(qb13);
		quizb.add(qb14);
		quizb.add(qb15);
		quizb.add(qb16);
		quizb.add(qb17);
		quizb.add(qb18);
		quizb.add(qb19);
		quizb.add(qb20);
		quizb.add(qb21);
		quizb.add(qb22);
		quizb.add(qb23);
		quizb.add(qb24);
		quizb.add(qb25);

		//Print out total number of quizzes, giving quiz e, d, c, a and b and the respective scores obtained
		System.out.println("You have " + Quiz.getTotalQuizzes() + " quizzes to do");
		quize.giveQuiz();
		System.out.println("Your score is " + quize.getScore());
		quizd.giveQuiz();
		System.out.println("Your score is " + quizd.getScore());
		quizc.giveQuiz();
		System.out.println("Your score is " + quizc.getScore());
		quiza.giveQuiz();
		System.out.println("Your score is " + quiza.getScore());
		quizb.giveQuiz(5, 10);
		System.out.println("Your score is " + quizb.getScore());
	}
}
