package edu.asu.hw4;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for the {@link StaffReviewManager} class.
 * <p>
 * This class verifies that questions, answers, and feedback entries are correctly
 * added and retrieved by the {@code StaffReviewManager}.
 * </p>
 * 
 * @author Ian
 */
public class StaffReviewManagerTest {

    /** Instance of StaffReviewManager used for testing. */
    private StaffReviewManager manager;

    /**
     * Initializes a new {@code StaffReviewManager} before each test case.
     */
    @BeforeEach
    public void setup() {
        manager = new StaffReviewManager();
    }

    /**
     * Tests the ability to add a {@link Question} to the manager
     * and verify that it can be retrieved correctly.
     */
    @Test
    public void testAddAndGetQuestion() {
        Question q = new Question("Test Q", "author1");
        manager.addQuestion(q);
        List<Question> qList = manager.getAllQuestions();
        assertEquals(1, qList.size());
        assertEquals("Test Q", qList.get(0).getContent());
    }

    /**
     * Tests the ability to add an {@link Answer} to the manager
     * and verify that it can be retrieved correctly.
     */
    @Test
    public void testAddAndGetAnswer() {
        Answer a = new Answer("Test A", "responder1");
        manager.addAnswer(a);
        List<Answer> aList = manager.getAllAnswers();
        assertEquals(1, aList.size());
        assertEquals("Test A", aList.get(0).getResponse());
    }

    /**
     * Tests the ability to add {@link Feedback} to the manager
     * and verify that it can be retrieved correctly.
     */
    @Test
    public void testAddAndGetFeedback() {
        Feedback f = new Feedback("Test feedback", "staff");
        manager.addFeedback(f);
        List<Feedback> fList = manager.getAllFeedbacks();
        assertEquals(1, fList.size());
        assertEquals("Test feedback", fList.get(0).getNote());
    }
}