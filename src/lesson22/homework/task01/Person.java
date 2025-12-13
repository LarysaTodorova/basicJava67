package lesson22.homework.task01;

/*
Задача:
Написать класс Person.
У человека должно быть имя, возраст, е-мейл, номер телефона.
Все поля должны быть закрыты от модификации извне.
Сделать один конструктор для создания объекта человека сразу со всеми параметрами.
Сделать доступ ко всем полям через геттер, кроме номера телефона.
Сделать возможность изменять е-мейл человека через сеттер.
Сеттер должен контролировать и не разрешать в качестве е-мейла вставлять пустую строку.
 */
public class Person {

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

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("Email is empty");
            return;
        }
        this.email = email;
    }
}
