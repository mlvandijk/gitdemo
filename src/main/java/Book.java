import java.util.List;
import java.util.Set;

public record Book(String title,
                   List<String> author,
                   String publisher,
                   String isbn,
                   int pages,
                   boolean illustrated) {

    public boolean containsAuthor(String name) {
        return author.contains(name);
    }
}
