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

        for (int i  = 0; i  < booksTitle.size(); i ++) {
            int shelvesIndex = (i * 5) / booksTitle.size();
            shelves.get(shelvesIndex).add(booksTitle.get(i));
        }
        return shelves;
    }

    public static void main(String[] args) {

        List<String> books = Arrays.asList("Колобок", "Начало", "Мастер и Маргарита", "Преступление и наказание", "Идиот", "Война и мир", "Анна Каренина", "Гамлет", "Ромео и Джульетта");

        List<List<String>> distributeBooks = distributedBooks(books);

        for (int i = 0; i < distributeBooks.size(); i++) {
            System.out.println("Полка " + (i + 1) + ": " + distributeBooks.get(i));

        }
     }
}