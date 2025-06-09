import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    //Задача
    //Необходимо реализовать следующий метод:
    //
    // На вход получаем список названий книг.
    // Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг.
    // Все книги должны быть отсортированы по алфавиту с первой до последней полки.
    // Количество полок константное — 5 штук.
    // Вернуть книги, распределенные по полкам.

    public static List<List<String>> distributedBooks (List<String> booksTitle){

        Collections.sort(booksTitle);

        List<List<String>> shelves = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            shelves.add(new ArrayList<>());
        }

        for (int i = 0; i < booksTitle.size(); i++) {
            int shalvesIndex = (i * 5) / booksTitle.size();
            shelves.get(shalvesIndex).add(booksTitle.get(i));
        }
        return shelves;
    }

    public static void main(String[] args) {

        List<String> books = Arrays.asList("Мастер и Маргарита", "Война и мир", "Анна Каренина", "Преступление и наказание", "Колобок", "Человек амфибия", "Кот Кокос", "Человек невидимка", "Смешарики", "Идиот");

        List<List<String>> distributeBooks = distributedBooks(books);

        for (int i = 0; i < distributeBooks.size(); i++) {
            System.out.println("Полка " + (i +1) + ": " + distributeBooks.get(i));
        }
    }
}