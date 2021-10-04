package by.bsuir.Task12;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int hashCode(){
        return price ^ edition ^ title.hashCode() ^ author.hashCode();
    }

    @Override
    public String toString(){
        return "Book{ \n title:" + this.title + ", author:" + this.author + ", price:" + price
                + ", Edition:" + edition;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return  true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
       return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

    @Override
    public Book clone(){
        return new Book(this.title, this.author, this.price);
    }
}
