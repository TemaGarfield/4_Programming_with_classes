package by.kotik.task9.logic;

import java.util.ArrayList;

import by.kotik.task9.entity.Book;

public class BookLogic {
    private ArrayList<Book> books;

    public BookLogic(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(String name, String publishingHouse, String author, int year, int numberOfPages, String bindingType) {
        this.books.add(new Book(name, publishingHouse, author, year, numberOfPages, bindingType));
    }

    public void showAuthors(String author) {
        for (Book book:books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.toString());
            }
        }
    }

    public void showPublishingHouse(String publishingHouse) {
        for (Book book:books) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                System.out.println(book.toString());
            }
        }
    }

    public void showBookYear(int year) {
        for (Book book:books) {
            if (book.getYear() >= year) {
                System.out.println(book.toString());
            }
        }
    }
}
