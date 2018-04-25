package com.example.ewa.booklist;

import java.util.ArrayList;

public class ReadingList {

    private ArrayList<Book> readingList;

    public ReadingList() {
        readingList = new ArrayList<>();
        readingList.add(new Book("Coraline", "Neil Gaiman", "9780380807345"));
        readingList.add(new Book("Wild Pork and Watercress", "Barry Crump", "9780959789751"));
        readingList.add(new Book("Piled Higher and Deeper", "Jorge Cham", "9780972169509"));
        readingList.add(new Book("Portugal", "Cyril Pedrosa", "9782800148137"));
        readingList.add(new Book("The Living Mountain", "Nan Shepherd", "9781847674241"));
        readingList.add(new Book("Hatchet Job", "Mark Kermode", "9781447230533"));
        readingList.add(new Book("The Man in the High Castle", "Philip K. Dick", "9780241246108"));
    }

    public ArrayList<Book> getReadingList() {
        return new ArrayList<>(readingList);
    }
}
