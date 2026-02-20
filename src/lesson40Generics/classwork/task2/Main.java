package lesson40Generics.classwork.task2;

import lesson33Lambdas.classwork.task2.Cat;

public class Main {
    public static void main(String[] args) {

        /*
        Создать коробку (класс Box), в которую можно складывать и извлекать объекты любых типов.
        Причём, когда мы извлекаем объект из коробки, он должен быть выбран случайным образом.
        То есть, достаём объект "вслепую" и заранее на знаем, какой именно объект
        вернёт нам коробка.
         */

        Box box = new Box();

        box.addItem(new Cat("White", 3, 4.5));

        //Cat cat = box.getItem();

//       Object object = box.getItem();
//       Cat cat = (Cat) object;
        Cat cat = (Cat) box.getItem();
        System.out.println("Cat's color: " + cat.getColor());

        box.addItem("Hello world!");

//        String text = (String) box.getItem();
//        System.out.println("String length: " + text.length());

        Object item = box.getItem();
        if (item instanceof String) {
            String text = (String) item;
            System.out.println("String length: " + text.length());
        }

        if (item instanceof Cat) {
            Cat cat1 = (Cat) item;
            System.out.println("Cat's color: " + cat1.getColor());
        }

    }
}
