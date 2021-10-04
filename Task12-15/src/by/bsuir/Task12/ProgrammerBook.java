package by.bsuir.Task12;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String language, int level){
        this.language = language;
        this.level = level;

    }

    @Override
    public int hashCode(){
        return this.language.hashCode() ^ this.level;
    }

    @Override
    public String toString(){
        return "ProgrammerBook{ \n language:" + this.language + ", level:" + this.level;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ProgrammerBook book = (ProgrammerBook) object;
        return this.language.equals(book.language) && this.level == book.level;
    }

    @Override
    public Book clone(){
        return new ProgrammerBook(this.language, this.level);
    }
}
