package by.bsuir.Task12;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("a", "bd", 4));
        books.add(new Book("f", "bad", 1));
        books.add(new Book("a", "bed", 5));
        books.add(new Book("b", "rgb", 2));
        books.add(new Book("c", "nst", 1));

        Comparator<Book> titleComparator = new TitleComparator();
        Comparator<Book> titleAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        Comparator<Book> authorTitleComparator = new AuthorComparator().thenComparing(new TitleComparator());
        Comparator<Book> authorTitlePriceComparator = new AuthorComparator().thenComparing(new TitleComparator()).thenComparing(new PriceComparator());

        books.sort(titleComparator);
        for (Book book:books) {
            System.out.println(book.toString());
        }
        System.out.println();
        books.sort(titleAuthorComparator);
        for (Book book:books) {
            System.out.println(book.toString());
        }
        System.out.println();
        books.sort(authorTitleComparator);
        for (Book book:books) {
            System.out.println(book.toString());
        }
        System.out.println();
        books.sort(authorTitlePriceComparator);
        for (Book book:books) {
            System.out.println(book.toString());
        }

    }
}
