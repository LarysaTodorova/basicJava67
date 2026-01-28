package lesson36Exceptions.gptPractice.task1;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
