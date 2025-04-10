package edu.asu.hw4;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages questions, answers, and feedback for review by staff.
 * Provides functionality to add and retrieve these items.
 */
public class StaffReviewManager {
    private List<Question> questions = new ArrayList<>();
    private List<Answer> answers = new ArrayList<>();
    private List<Feedback> feedbacks = new ArrayList<>();

    /**
     * Adds a question to the list.
     * @param q the question to add
     */
    public void addQuestion(Question q) {
        questions.add(q);
    }

    /**
     * Adds an answer to the list.
     * @param a the answer to add
     */
    public void addAnswer(Answer a) {
        answers.add(a);
    }

    /**
     * Adds feedback to the list.
     * @param f the feedback to add
     */
    public void addFeedback(Feedback f) {
        feedbacks.add(f);
    }

    /**
     * Retrieves all questions.
     * @return a list of all questions
     */
    public List<Question> getAllQuestions() {
        return new ArrayList<>(questions);
    }

    /**
     * Retrieves all answers.
     * @return a list of all answers
     */
    public List<Answer> getAllAnswers() {
        return new ArrayList<>(answers);
    }

    /**
     * Retrieves all feedback items.
     * @return a list of all feedbacks
     */
    public List<Feedback> getAllFeedbacks() {
        return new ArrayList<>(feedbacks);
    }

    /**
     * Clears all stored questions, answers, and feedback.
     */
    public void clearAll() {
        questions.clear();
        answers.clear();
        feedbacks.clear();
    }
}