package application;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

/**
 * Unit tests for the DatabaseHelper class.
 * Tests adding, retrieving, and resolving questions.
 */
public class DatabaseHelperTest {
    private DatabaseHelper dbHelper;

    /**
     * Sets up a new DatabaseHelper instance before each test.
     */
    @Before
    public void setUp() {
        dbHelper = new DatabaseHelper();
    }

    /**
     * Tests adding a question to the database.
     */
    @Test
    public void testAddQuestion() {
        Question q = new Question("Java Error", "How to fix NullPointerException?", "Alice");
        dbHelper.addQuestion(q);
        List<Question> questions = dbHelper.getAllQuestions();
        assertEquals(1, questions.size());
        assertEquals("Java Error", questions.get(0).getTitle());
    }

    /**
     * Tests retrieving all questions from the database.
     */
    @Test
    public void testGetAllQuestions() {
        Question q1 = new Question("Bug", "Why is my code not compiling?", "Bob");
        Question q2 = new Question("Loop Issue", "How to fix an infinite loop?", "Charlie");

        dbHelper.addQuestion(q1);
        dbHelper.addQuestion(q2);

        List<Question> questions = dbHelper.getAllQuestions();
        assertEquals(2, questions.size());
    }

    /**
     * Tests resolving a question in the database.
     */
    @Test
    public void testResolveQuestion() {
        Question q = new Question("Syntax Error", "What is missing in my for loop?", "Dan");
        dbHelper.addQuestion(q);

        boolean resolved = dbHelper.resolveQuestion("Syntax Error");
        assertTrue(resolved);
        assertTrue(q.isResolved());
    }

    /**
     * Tests resolving a non-existent question.
     */
    @Test
    public void testResolveNonExistentQuestion() {
        boolean resolved = dbHelper.resolveQuestion("Unknown Question");
        assertFalse(resolved);
    }
}