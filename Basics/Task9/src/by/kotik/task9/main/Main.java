package by.kotik.task9.main;

import java.util.ArrayList;

import by.kotik.task9.logic.BookLogic;

/*
 * 9. Создать класс Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) Список книг заданного автора.
 * b) Список книг, выпущенных заданным издательством.
 * c) Список книг, выпущенных после заданного года.
 * */

public class Main {

	public static void main(String[] args) {
        BookLogic bookLogic = new BookLogic(new ArrayList<>());

        bookLogic.addBook("The Godfather","G.P. Putnam's Sons", "Mario Puzo", 1969, 500, "Hard");
        bookLogic.addBook("Harry Potter and the Philosopher's Stone","Bloomsbury Publishing", "J. K. Rowling", 1997, 223, "Soft");
        bookLogic.addBook("Harry Potter and the Chamber of Secrets","Bloomsbury Publishing", "J. K. Rowling", 1998, 251, "Hard");

        bookLogic.showAuthors("J. K. Rowling");
        System.out.println();
        bookLogic.showPublishingHouse("Bloomsbury Publishing");
        System.out.println();
        bookLogic.showBookYear(1950);

	}

}
