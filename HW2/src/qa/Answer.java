package qa;

public class Answer {
	private int questionId;
	private String text;
	
	public Answer(int questionId, String text) {
		this.questionId = questionId;
		this.text = text;
	}
	
	public int getQuestionId() { return questionId; }
	public void setQuestionId(int questionId) { this.questionId = questionId; }
	
	public String getText() { return text; }
	public void setText(String text) { this.text = text; }
	
	@Override
	public String toString() {
		return "Answer ( Q" + questionId + text;
	}
}
