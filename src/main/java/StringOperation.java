

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author raja
 *
 */
public class StringOperation {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String input = "AbraCadABraAlakAzam";
    char[] charArray = input.toCharArray();
    removeDuplicates(charArray);
    
    String[] exclude = { "and", "he", "the","to","is" };
    StringOperation s = new StringOperation();
    List<String> mostFrequentlyUsedWords= s.retrieveMostFrequentlyUsedWords("Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favorite food.",
        Arrays.asList(exclude));
    mostFrequentlyUsedWords.forEach(System.out::println);

  }

  private static void removeDuplicates(char[] charArray) {
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
  }
  
  List<String> retrieveMostFrequentlyUsedWords(String literatureText, List<String> wordsToExclude) {
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		Integer count;
		Integer maxCount = 0;
		List<String> mostFrequentlyUsedWords = new ArrayList<String>();
		String[] words = literatureText.split("\\W+");
		String lowerCase;
		for (String word : words) {
			count = 1;
			lowerCase = word.toLowerCase();
			if (!wordsToExclude.contains(lowerCase)) {
				if (wordCount.get(lowerCase) != null) {
					count = wordCount.get(lowerCase) + 1;
				}

				wordCount.put(lowerCase, count);

				if (maxCount < count) {
					maxCount = count;
				}
			}

		}
		for (String word : wordCount.keySet()) {
			if (maxCount == wordCount.get(word)) {
				mostFrequentlyUsedWords.add(word);
			}
		}

		Map<String, Long> newWordCount = Arrays.asList(words).stream()
	      .filter(word -> !wordsToExclude.contains(word))
	      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (String key : newWordCount.keySet()) {
			System.out.println(key + ":" + newWordCount.get(key));
		}
		
		Optional<Entry<String, Long>> aa= Arrays.asList(words).stream()
	      .filter(word -> !wordsToExclude.contains(word))
	      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	      .entrySet().stream()
	      .max(Comparator.comparing(Entry::getValue));
		System.out.println("\n::"+aa);
		return mostFrequentlyUsedWords;
	}

}
