import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
  public static void main(String[] args) {
    // Create an array list for doubles.
    ArrayList<Integer> al = new ArrayList<>();

    // Add values to the array list.
    for (int i = 1; i <= 20; i++) {
      al.add(i);
    }
    
    // getting Spliterator object on al
    Spliterator<Integer> spltr1 = al.spliterator();

    // trySplit() method
    Spliterator<Integer> spltr2 = spltr1.trySplit();

    // If splitr1 could be split, use splitr2 first.
    if (spltr2 != null) {
      System.out.println("Output from splitr2: ");
      spltr2.forEachRemaining((n) -> System.out.println(n));
    }

    // Now, use the splitr
    System.out.println("\nOutput from splitr1: ");
    spltr1.forEachRemaining((n) -> System.out.println(n));

  }
}