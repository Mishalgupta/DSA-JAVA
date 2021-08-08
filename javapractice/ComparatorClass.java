package javapractice;

import java.util.*;

interface comparator {
    int compare(Object o1, Object o2);
}

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String gettitle() {
        return (title);
    }

    public double getprice() {
        return (price);
    }
}

class MyComparator implements comparator {
    public int compare(Object o1, Object o2) {
        Book bk1 = (Book) o1;
        Book bk2 = (Book) o2;
        if (bk1.getprice() < bk2.getprice()) {
            return (-1);
        } else {
            return (1);
        }
    }
}

public class ComparatorClass {

    public static void main(String[] args) {
        Book b1, b2, b3;
        b1 = new Book("Hey", 100.00);
        b2 = new Book("My", 100.50);
        b3 = new Book("Love", 200.00);
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add(b1);
        ts.add(b2);
        ts.add(b3);
        Book book;
        Iterator i1 = ts.iterator();
        while (i1.hasNext()) {
            book = (Book) i1.next();
            System.out.println(book.gettitle() + "" + book.getprice());
        }
    }

}
