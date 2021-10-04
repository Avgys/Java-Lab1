package by.bsuir.Task12;
import java.util.Comparator;

class TitleComparator implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        return b1.getTitle().compareTo(b2.getTitle());
    }
}

class AuthorComparator implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}

class PriceComparator implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        if(b1.getPrice() > b2.getPrice()){
            return 1;
        }
        else if (b1.getPrice() < b2.getPrice()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
