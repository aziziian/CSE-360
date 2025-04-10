package edu.asu.hw4;

/**
 * Represents private feedback given by staff to a user.
 */
public class Feedback {
    private String note;
    private String from;

    /**
     * Constructs new Feedback.
     * @param note the feedback text
     * @param from the name of the staff member providing the feedback
     */
    public Feedback(String note, String from) {
        this.note = note;
        this.from = from;
    }

    /**
     * @return the feedback note
     */
    public String getNote() {
        return note;
    }

    /**
     * @return the name of the staff member
     */
    public String getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "Feedback: \"" + note + "\" from " + from;
    }
}