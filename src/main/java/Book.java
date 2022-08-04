import java.util.List;

public record Book(String title,
                   List<String> authors,
                   String publisher,
                   String isbn,
                   int pages,
                   boolean illustrated) {

    public boolean containsAuthor(String author) {
        return authors.contains(author);
    }
}
