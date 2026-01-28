package lesson36Exceptions.gptPractice.task1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*
        Есть класс User:
id (long)
email (String)
age (int)
Создай UserService, который:
добавляет пользователя
ищет пользователя по email
Требования
если email пустой → EmptyEmailException (checked)
если age < 0 → InvalidAgeException (checked)
если пользователь не найден → UserNotFoundException (checked)
Подсказка
проверки делать в сервисе
Main — только try/catch
         */

        UserService userService = new UserService();

        try {
            userService.addUser(new User(1, "orh@hfj.mkh", 26));
            userService.addUser(new User(2, "qerny@kdfj.cnm", 18));
            userService.addUser(new User(3, "hgjt@dlkgl.ghj", 57));
            userService.addUser(new User(4, "nvmirolsc@gkl.kglh", 60));
            userService.addUser(new User(5, "optmc@jgu.mkh", 15));
        } catch (EmptyEmailException | InvalidAgeException e) {
            System.out.println("Error! " + e.getMessage());
        }

        try {
            User user = userService.findUserByEmail("optmc@jgu.mkh");
            System.out.println("User with email " + user.getEmail() + " is found!");

            System.out.println("User's age is: " + user.getAge());
        } catch (UserNotFoundException e) {
            System.out.println("Error! " + e.getMessage());
        }

        Optional<User> optionalUser = userService.findOptionalUserByEmail("optmc@jgu.mkh");

        optionalUser.ifPresentOrElse(
                user -> System.out.println("User found " + user.getEmail()),
                () -> System.out.println("User not found")
        );

    }
}
