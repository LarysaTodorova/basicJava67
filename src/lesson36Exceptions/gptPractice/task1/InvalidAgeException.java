package lesson36Exceptions.gptPractice.task1;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
