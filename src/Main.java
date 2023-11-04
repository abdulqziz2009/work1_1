import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Объявляем переменную типа String
        String multipleWordString = "Несколько слов в строке";

        // Создаем константу "num" и задаем ей значение
        final int num = 5;

        // Создаем переменную "word" и задаем ей значение
        String word = "Пример";

        // Задаем значение первой переменной из конкатенации "num" и "word"
        String concatenatedString = num + word;

        // Выводим значения переменных в одну строку
        System.out.println("multipleWordString: " + multipleWordString);
        System.out.println("num: " + num);
        System.out.println("word: " + word);
        System.out.println("concatenatedString: " + concatenatedString);

        // Добавляем условную конструкцию
        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        // Запрос имени пользователя
        System.out.print("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!");
    }
}
