import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public record Book(String title,
                   List<String> author,
                   String publisher,
                   LocalDate publicationDate,
                   String isbn,
                   int pages) {

    public boolean containsAuthor(String name) {
        return author.contains(name);
    }

    public boolean isPreOrder() {
        return publicationDate.isAfter(LocalDate.now());
    }
}
