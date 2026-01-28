package lesson36Exceptions.gptPractice.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private final List<User> users = new ArrayList<>();

    private long counter = 0;

    public void addUser(User user) throws EmptyEmailException, InvalidAgeException {
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            throw new EmptyEmailException("User's email must not be empty");
        }
        if (user.getAge() < 0) {
            throw new InvalidAgeException("User's age must not be less than 0");
        }
        user.setId(++counter);
        users.add(user);
    }

    public User findUserByEmail(String email) throws UserNotFoundException {

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("User's email must not be empty");
        }

        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        throw new UserNotFoundException("We have no user with such email " + email);
    }

    public Optional<User> findOptionalUserByEmail(String email) {
        if (email == null || email.isBlank()) {
            return Optional.empty();
        }
        return users
                .stream()
                .filter(x -> email.equals(x.getEmail()))
                .findFirst();
    }

    public void printUsers() {
        users.forEach(System.out::println);
    }
}
