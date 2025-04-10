package edu.asu.hw4;

/**
 * Represents a question submitted by a user.
 * Contains the question content and the author's name.
 */
public class Question {
    private String content;
    private String author;

    /**
     * Constructs a new Question.
     * @param content the question text
     * @param author the name of the question's author
     */
    public Question(String content, String author) {
        this.content = content;
        this.author = author;
    }

    /**
     * @return the content of the question
     */
    public String getContent() {
        return content;
    }

    /**
     * @return the author of the question
     */
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Question: \"" + content + "\" by " + author;
    }
}
