package edu.asu.hw4;

/**
 * Represents an answer submitted in response to a question.
 */
public class Answer {
    private String response;
    private String responder;

    /**
     * Constructs a new Answer.
     * @param response the text of the answer
     * @param responder the name of the person answering
     */
    public Answer(String response, String responder) {
        this.response = response;
        this.responder = responder;
    }

    /**
     * @return the content of the answer
     */
    public String getResponse() {
        return response;
    }

    /**
     * @return the name of the responder
     */
    public String getResponder() {
        return responder;
    }

    @Override
    public String toString() {
        return "Answer: \"" + response + "\" by " + responder;
    }
}
