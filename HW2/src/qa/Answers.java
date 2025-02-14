package qa;

import java.util.ArrayList;
import java.util.List;

public class Answers {
	private List<Answer> answerList;
	
	public Answers() {
		this.answerList = new ArrayList<>();
	}
	
	public void addAnswer(Answer a) { answerList.add(a); }
	
	public List<Answer> getAnswersForQuestion(int questionId) {
		List<Answer> answers = new ArrayList<>();
		for (Answer a: answerList) {
			if (a.getQuestionId() == questionId) {
				answers.add(a);
			}
		}
		return answers;
	}
	
	public boolean deleteAnswersForQuestion(int questionId) {
		return answerList.removeIf(a -> a.getQuestionId() == questionId);
	}

}
