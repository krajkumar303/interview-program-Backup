import java.util.HashMap;
import java.util.Map;

class FirstNonRepeatChar {
  public static void main(String[] args) {
    firstNonRepeatChar("rajkumar");
  }

  public static char firstNonRepeatChar(String input) {
    char[] charArray = input.toCharArray();
    char nonRepeatChar = 0;
    Map<Character, Integer> characterCount = new HashMap<Character, Integer>();
    Integer count;
    for (char letter : charArray) {
      count = 1;
      if (characterCount.get(letter) != null) {
        count = characterCount.get(letter) + 1;
      }
      characterCount.put(letter, count);
    }

    for (char letter : charArray) {
      if (characterCount.get(letter) == 1) {
        System.out.print("firstNonRepeatChar::"+letter);
        nonRepeatChar = letter;
        break;
      }
    }
    return nonRepeatChar;
  }

}