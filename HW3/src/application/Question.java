package application;

/**
 * Represents a question posted in the system.
 * A question consists of a title, description, author, and status (resolved or unresolved).
 */
public class Question {
    private String title;
    private String description;
    private String postedBy;
    private boolean resolved;

    /**
     * Constructs a Question with the specified title, description, and author.
     * The question is initially unresolved.
     *
     * @param title       The title of the question.
     * @param description The description providing details about the question.
     * @param postedBy    The author who posted the question.
     */
    public Question(String title, String description, String postedBy) {
        this.title = title;
        this.description = description;
        this.postedBy = postedBy;
        this.resolved = false;
    }

    /**
     * Retrieves the title of the question.
     *
     * @return The title as a String.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retrieves the description of the question.
     *
     * @return The description as a String.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retrieves the author who posted the question.
     *
     * @return The author's name as a String.
     */
    public String getPostedBy() {
        return postedBy;
    }

    /**
     * Checks whether the question has been resolved.
     *
     * @return true if the question is resolved, false otherwise.
     */
    public boolean isResolved() {
        return resolved;
    }

    /**
     * Marks the question as resolved.
     */
    public void resolve() {
        this.resolved = true;
    }
}