package lesson36Exceptions.gptPractice.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    public final List<User> users = new ArrayList<>();

    public void addUser(User user) throws EmptyEmailException, InvalidAgeException {
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            throw new EmptyEmailException("User's email must not be empty");
        }
        if (user.getAge() < 0) {
            throw new InvalidAgeException("User's age must not be less than 0");
        }
        users.add(user);
    }

    public User findUserByEmail(String email) throws UserNotFoundException {

        if (email == null || email.isBlank()) {
            throw new UserNotFoundException("User's email must not be empty");
        }

        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        throw new UserNotFoundException("We have no user with such email " + email);
    }

    public Optional<User> findOptionalUserByEmail(String email) {
        return users
                .stream()
                .filter(x -> x.getEmail().equals(email))
                .findFirst();
    }
}
