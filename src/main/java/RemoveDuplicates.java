
/**
 * 
 */

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author raj
 *
 */
public class RemoveDuplicates {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Please enter your input String::");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    if (input != null && !input.isEmpty()) {
      removeDuplicates(input);
    }
  }

  /**
   * This method will accept String as input and remove the all the duplicates
   * character(s).
   * 
   * @param charArray
   */
  private static void removeDuplicates(String input) {
    char[] charArray = input.toCharArray();
    Set<String> charSet = new LinkedHashSet<String>();
    for (char letter : charArray) {
      //charSet.add(String.valueOf(letter));
      if (!(charSet.contains(String.valueOf(letter).toLowerCase())
          || charSet.contains(String.valueOf(letter).toUpperCase()))) {
        charSet.add(String.valueOf(letter));
      }
    }
    System.out.print("Output is::");
    charSet.forEach(System.out::print);
    System.out.println("\nStream Output is::");
    charSet.stream().distinct().collect(Collectors.toList()).stream();

    List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);

    IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

    System.out.println("Highest number in List : " + stats.getMax());
    System.out.println("Lowest number in List : " + stats.getMin());
    System.out.println("Sum of all numbers : " + stats.getSum());
    System.out.println("Average of all numbers : " + stats.getAverage());
  }

}
