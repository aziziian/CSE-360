package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages a collection of questions and answers.
 * Provides methods to add, retrieve, and resolve questions.
 */
public class DatabaseHelper {
    private List<Question> questions;

    /**
     * Constructs a DatabaseHelper to manage questions.
     */
    public DatabaseHelper() {
        this.questions = new ArrayList<>();
    }

    /**
     * Adds a new question to the database.
     *
     * @param question The question to be added.
     */
    public void addQuestion(Question question) {
        questions.add(question);
    }

    /**
     * Retrieves all questions in the database.
     *
     * @return A list of all stored questions.
     */
    public List<Question> getAllQuestions() {
        return new ArrayList<>(questions);
    }

    /**
     * Resolves a question based on its title.
     *
     * @param title The title of the question to be resolved.
     * @return true if the question was found and resolved, false otherwise.
     */
    public boolean resolveQuestion(String title) {
        for (Question q : questions) {
            if (q.getTitle().equalsIgnoreCase(title)) {
                q.resolve();
                return true;
            }
        }
        return false;
    }
}
