import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Объявляем переменную с типом данных String, название которой состоит из нескольких слов
        String fullName;

        // 2. Создаем константу “NUM” с типом данных int и задаем ей любое значение
        final int NUM = 11;

        // 3. Создаем переменную “word” с типом данных String и задаем ей любое значение
        String word = "GOAT!";

        // 4. Задаем значение переменной, объявленной в пункте 1
        fullName = NUM + " " + word;

        // 5. Распечатываем в консоли значение всех переменных
        System.out.println("Полное имя: " + fullName);
        System.out.println("Константа NUM: " + NUM);
        System.out.println("Слово: " + word);

        // 6. Условная конструкция для проверки значения константы “NUM”
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        // 7. Выводим строку “Введите ваше имя: ”
        System.out.print("Введите ваше имя: ");

        // 8. Просим пользователя ввести имя и считываем его с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String usersName = scanner.next();

        // 9. Приветствуем пользователя по имени
        System.out.println("Привет, " + usersName + "!");

        // Закрываем Scanner
        scanner.close();
    }
}
