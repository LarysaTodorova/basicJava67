package lesson36Exceptions.gptPractice.task1;

public class EmptyEmailException extends Exception {
    public EmptyEmailException(String message) {
        super(message);
    }
}
