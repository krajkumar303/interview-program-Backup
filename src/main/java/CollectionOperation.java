import com.raj.sample.domain.Author;
import com.raj.sample.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperation {

	public static void main(String[] args) {
        List<String> nameList= new ArrayList<String>();
        nameList.add("Raj");
        nameList.add("Kumar");
        nameList.add("Jeyanthi");
        
        List<String> resultList= nameList.stream().filter(name -> name.startsWith("R")).collect(Collectors.toList());
        resultList.forEach(System.out::println);
        
        List<Book> books = new ArrayList<> ();
        Book book = new Book();
        book.setIsbn("12345");
        book.setName("Camel In Action");
        List<Author> authors = new ArrayList();
        Author author = new Author();
        author.setFirstName("Raj");
        author.setLastName("Kumar");
        authors.add(author );
        book.setAuthors(authors);
        books.add(book);
        
        book = new Book();
        book.setIsbn("12346");
        book.setName("Spring In Action");
        authors = new ArrayList();
        author = new Author();
        author.setFirstName("Raj");
        author.setLastName("Kumar");
        authors.add(author );
        author = new Author();
        author.setFirstName("David");
        author.setLastName("Wood");
        authors.add(author );
        book.setAuthors(authors);
        books.add(book);
        
      List<Book> filteredBooks= books.stream().filter(bok -> bok.getName().contains("Action")).collect(Collectors.toList());
      
      filteredBooks.forEach(System.out::println);
    }

}
