package ru.job4j.pojo;

/**
 * Класс демонстрирующий работу массивов и моделей
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class Library {

    /**
     * 1.Метод сначала демонстрирует массив с книгами как есть
     * 2.Далее производится подмена 0 и 3 элемента местами
     * 3.Снова выводится содержимое массива
     * 4.Выводится только содержимое массива содержащее в названии "Clean code"
     *
     * @param args - аргументы
     */
    public static void main(String[] args) {
        Book first = new Book("Kids story", 152);
        Book second = new Book("Head First Java", 525);
        Book third = new Book("Esoteric book", 1002);
        Book four = new Book("Clean code", 163);

        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = four;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCount());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getCount());
        }

        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(books[index].getName() + " - " + books[index].getCount());
            }
        }

    }
}
