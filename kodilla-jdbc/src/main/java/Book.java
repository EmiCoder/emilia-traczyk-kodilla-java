import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;

public class Book {
    String title;
    String author;
    LocalDate releaseDate;

    public Book(String title, String author, LocalDate date) {
        this.title = title;
        this.author = author;
        this.releaseDate = date;
    }

    public int hashCode() {
        return releaseDate.getYear();
    }

    public boolean equals(Object o) {
        Book e = (Book) o;
        return  (title.equals(e.getTitle())) &&
                (author.equals(e.getAuthor())) &&
                (releaseDate.getYear() == e.getReleaseDate().getYear());
    }

    public String toString() {
        return title + ", " + author + ", released: " + releaseDate.getYear();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Book writing1 = new Book("The Silent Patient", "Alex Michaelides", LocalDate.of(2017, Month.FEBRUARY,3));
        Book writing2 = new Book("The Girl on the Train", "Paula Hawkins", LocalDate.of(2015,Month.FEBRUARY,3));
        Book writing3 = new Book("In a Dark, Dark Wood", "Ruth Ware", LocalDate.of(2011,Month.FEBRUARY,3));
        Book writing4 = new Book("Before I Go to Sleep", "S. J. Watson", LocalDate.of(2003,Month.FEBRUARY,3));

        HashSet<Book> writingsSet = new HashSet<Book>();
        writingsSet.add(writing1);
        writingsSet.add(writing2);
        writingsSet.add(writing3);
        writingsSet.add(writing4);

        for(Book theWriting: writingsSet) {
            System.out.println(theWriting);
        }
    }
}
