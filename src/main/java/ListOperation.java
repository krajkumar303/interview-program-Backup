import com.raj.sample.domain.Author;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Spliterator;

public class ListOperation {

  public static void main(String[] args) {
    List<Integer> numberList = new ArrayList<Integer>();

    for (int i = 1; i <= 20; i++) {
      numberList.add(i);
    }

    Spliterator<Integer> spltr1 = numberList.spliterator();

    Spliterator<Integer> spltr2 = spltr1.trySplit();
    
    Spliterator<Integer> spltr3 = spltr1.trySplit();
    
    System.out.println("-----------------");
    spltr3.forEachRemaining(System.out::println);
    System.out.println("-----------------");
    spltr2.forEachRemaining(System.out::println);

    System.out.println("-----------------");
    spltr1.forEachRemaining(System.out::println);
    
    Hashtable<Author,String> hm = new Hashtable<Author,String> (3);
    
    Author key = new Author();
    key.setFirstName("Raj");
    key.setLastName("kumar");
    hm.put(key , "1");
    
    key = new Author();
    key.setFirstName("raj");
    key.setLastName("Kumar");
    hm.put(key , "2");
    
   System.out.println(hm.keys().nextElement());
    Collections.synchronizedCollection(numberList);
  }

}
