package by.bsuir.Task12;

import java.util.Random;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition = 1;
    private int isbn;

    private static Random randomInteger = new Random();

    public Book(){
    }
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = randomInteger.nextInt();
    }

    public int getIsbn(){
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public int compareTo(Book book){
        if (book.isbn == this.isbn){
            return 0;
        }
        else if (book.isbn > this.isbn){
            return -1;
        }
        else{
            return 1;
        }

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
