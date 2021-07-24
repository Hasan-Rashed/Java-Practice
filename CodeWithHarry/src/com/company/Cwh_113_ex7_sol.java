package com.company;

import java.awt.print.Book;
import java.util.ArrayList;

class Book2
{
   public String name, author;

    public Book2(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "Book2{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary
{
    public ArrayList<Book2> books;
    public MyLibrary(ArrayList<Book2> books)
    {
        this.books = books;
    }
    public void addBook(Book2 book)
    {
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book2 book, String issued_to)
    {
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.add(book);
    }

    public void  returnBook(Book2 book)
    {
        System.out.println("The book has been returned");
        this.books.remove(book);
    }
}

public class Cwh_113_ex7_sol
{
    public static void main(String[] args)
    {
        ArrayList<Book2> books = new ArrayList<>();

        Book2 b1 = new Book2("Algorithms", "CLRS");
        books.add(b1);

        Book2 b2 = new Book2("Algorithms", "CLRS");
        books.add(b2);

        Book2 b3 = new Book2("Algorithms", "CLRS");
        books.add(b3);

        Book2 b4 = new Book2("Algorithms", "CLRS");
        books.add(b4);

        MyLibrary library = new MyLibrary(books);
        library.addBook(new Book2("Algo4", "MyAuthor"));
        System.out.println(library.books);

        library.issueBook(b3, "Harry");
        System.out.println(library.books);
    }
}
