package qa;

import java.util.HashMap;
import java.util.Map;

public class Questions {
    private Map<Integer, Question> questions; // Declare the questions map

    public Questions() {
        this.questions = new HashMap<>(); // Initialize the map
    }

    public void addQuestion(Question question) {
        if (question.getText() == null || question.getText().trim().isEmpty()) {
            throw new IllegalArgumentException("Question text cannot be empty.");
        }
        questions.put(question.getId(), question);
    }

    public Question getQuestion(int id) {
        return questions.get(id);
    }

    public boolean updateQuestion(int id, String newText) {
        Question question = questions.get(id);
        if (question != null) {
            question.setText(newText);
            return true;
        }
        return false;
    }

    public boolean deleteQuestion(int id) {
        return questions.remove(id) != null;
    }
}
