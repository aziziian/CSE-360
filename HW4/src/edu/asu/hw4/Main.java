package edu.asu.hw4;

public class Main {
    public static void main(String[] args) {
        StaffReviewManager manager = new StaffReviewManager();

        manager.addQuestion(new Question("What is polymorphism?", "student1"));
        manager.addAnswer(new Answer("Polymorphism allows methods to behave differently.", "ta1"));
        manager.addFeedback(new Feedback("Good explanation, but add example.", "instructor"));

        System.out.println("=== Questions ===");
        for (Question q : manager.getAllQuestions()) {
            System.out.println(q);
        }

        System.out.println("=== Answers ===");
        for (Answer a : manager.getAllAnswers()) {
            System.out.println(a);
        }

        System.out.println("=== Feedback ===");
        for (Feedback f : manager.getAllFeedbacks()) {
            System.out.println(f);
        }
    }
}
