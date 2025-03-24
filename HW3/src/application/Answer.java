package application;
/**
 * Represents an answer to a question.
 * Each answer is associated with a question and contains the respondent's name.
 */
public class Answer {
    private String response;
    private String answeredBy;

    /**
     * Constructs an Answer with the specified response and respondent's name.
     *
     * @param response   The response text.
     * @param answeredBy The name of the person providing the answer.
     */
    public Answer(String response, String answeredBy) {
        this.response = response;
        this.answeredBy = answeredBy;
    }

    /**
     * Retrieves the response text.
     *
     * @return The response as a String.
     */
    public String getResponse() {
        return response;
    }

    /**
     * Retrieves the name of the respondent.
     *
     * @return The respondent's name as a String.
     */
    public String getAnsweredBy() {
        return answeredBy;
    }
}
