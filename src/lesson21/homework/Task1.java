package lesson21.homework;

public class Task1 {
    public static void main(String[] args) {
    /*
   Создать объект StringBuilder.
   Наполнить строку именами студентов (5-7 имён) через пробел.
   Вырезать из строки имя какого-нибудь студента (используйте метод delete).
   Вставить в строку имя студента вместо имени другого студента (используйте метод replace).
   После каждого шага, изменяющего строку, выводить её в консоль.
    */

        StringBuilder builder = new StringBuilder();
        builder.append("Alexa, ");
        builder.append("Bob, ");
        builder.append("Carl, ");
        builder.append("Olivia, ");
        builder.append("Luisa, ");
        builder.append("Stephan.");
        System.out.println("Names before delete: " + builder);

        builder.delete(7, 12);
        System.out.println("Names after delete: " + builder);

        builder.replace(7, 11, "Fabian");
        System.out.println("Names after replace: " + builder);

    }
}
