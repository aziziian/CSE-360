package application;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseHelper db = new DatabaseHelper();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Question");
            System.out.println("2. View Questions");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter question title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter question text: ");
                    String text = scanner.nextLine();
                    System.out.print("Enter posted by: ");
                    String postedBy = scanner.nextLine();

                    Question q = new Question(title, text, postedBy);
                    db.addQuestion(q);
                    System.out.println("Question added!");
                    break;
                    
                case 2:
                    System.out.println("\nQuestions:");
                    for (Question question : db.getAllQuestions()) {
                        System.out.println("- " + question.getTitle() + " (" + question.getPostedBy() + ")");
                    }
                    break;
                    
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}