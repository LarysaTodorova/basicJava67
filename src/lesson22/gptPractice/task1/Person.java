package lesson22.gptPractice.task1;

public class Person {

    /*
    Задача: переделай setEmail, чтобы он не печатал сообщение, а возвращал boolean:
true → email изменён
false → email НЕ изменён (если null или пустая строка)
Требования:
email == null → false
email.isEmpty() → false
иначе → присвоить и вернуть true
     */

    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    public Person(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email == null || email.isBlank()) {
            return false;
        }
        this.email = email;
        return true;
    }
}
