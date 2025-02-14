package qa;

public class Main {
	public static void main(String[] args) {
		Questions questions = new Questions();
		Answers answers = new Answers();
		
		Question q1 = new Question(1, "What is Java?");
		questions.addQuestion(q1);
		System.out.println("Added: " + questions.getQuestion(1));
		
		answers.addAnswer(new Answer(1, "A programming languuage"));
		answers.addAnswer(new Answer(1, "Used in backend development"));
		
		System.out.println("Answers for Q1: ");
		for (Answer a : answers.getAnswersForQuestion(1)) {
			System.out.println(a);
		}
		
		questions.updateQuestion(1, "What is Java used for?");
		System.out.println("Updated: " + questions.getQuestion(1)); //Update Question
		
		questions.deleteQuestion(1);
		System.out.println("Deleted: " + (questions.getQuestion(1) == null));
	}

}
