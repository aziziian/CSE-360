package qa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuestionsTest {
    private Questions questions;

    @BeforeEach
    public void setUp() {
        questions = new Questions();
    }

    @Test
    public void testAddAndRetrieveQuestion() {
        Question q = new Question(1, "What is Java?");
        questions.addQuestion(q);
        assertNotNull(questions.getQuestion(1));
        assertEquals("What is Java?", questions.getQuestion(1).getText());
    }

    @Test
    public void testUpdateQuestion() {
        Question q = new Question(2, "Old Question?");
        questions.addQuestion(q);
        assertTrue(questions.updateQuestion(2, "New Question?"));
        assertEquals("New Question?", questions.getQuestion(2).getText());
    }

    @Test
    public void testDeleteQuestion() {
        Question q = new Question(3, "Delete me");
        questions.addQuestion(q);
        assertTrue(questions.deleteQuestion(3));
        assertNull(questions.getQuestion(3));
    }
    @Test
    public void testAddQuestionWithEmptyText() {
        Questions questions = new Questions(); // Ensure Questions class is properly instantiated
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            questions.addQuestion(new Question(4, "")); // Passing an empty string
        });

        // Ensure error message matches exactly what your method throws
        String expectedMessage = "Question text cannot be empty."; 
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage)); // Check if error message contains expected text
    }
}