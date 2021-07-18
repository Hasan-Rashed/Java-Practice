package com.company;

import java.awt.print.Book;

class Library1
{
    String [] books;
    int no_of_books;

    Library1()
    {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book)
    {
        this.books[no_of_books++] = book;
        System.out.println(book + " has been added");
    }

    void showAvailableBooks()
    {
        System.out.println("Available Books are: ");
        for (String book : this.books)
        {
            if (book == null)
                continue;
            System.out.println("* " + book);
        }
    }

    void issueBook(String book)
    {
        for (int i = 0; i < this.books.length; i++)
        {
            if (this.books[i].equals(book))
            {
                System.out.println("the book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist.");
    }

    void returnBook(String book)
    {
        addBook(book);
    }
}

public class Cwh_61_Ex4_sol
{
    public static void main(String[] args)
    {
        Library1 centralLibrary = new Library1();

        centralLibrary.addBook("Physics");
        centralLibrary.addBook("Chemistry");
        centralLibrary.addBook("Algorithm");
        centralLibrary.addBook("C++");

        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}