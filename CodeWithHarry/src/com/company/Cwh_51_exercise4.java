package com.company;

class Library
{
    int i = 0;
    String [] availableBook = new String[7];
    String [] issuedBook;

    public void issueBook() // means checkout
    {

    }

    public void returnBook() // means check in
    {

    }

    public void showAvailableBooks()
    {
        for (int i = 0; i < availableBook.length; i++)
        {
            System.out.println(availableBook[i] + " ");
        }
    }

    public void addBook(String book)
    {
        availableBook[i] = book;
        i++;
    }
}

public class Cwh_51_exercise4
{
    public static void main(String[] args)
    {
        Library lib = new Library();
        lib.addBook("Physics");
        lib.addBook("Chemistry");
        lib.addBook("Math");
        lib.addBook("Biology");

        System.out.println(lib.availableBook);


    }
}
