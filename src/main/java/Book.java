import java.util.Set;

public record Book(String title,
                   Set<String> author,
                   String publisher,
                   String isbn,
                   int pages) {
}
