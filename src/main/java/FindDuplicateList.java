import java.util.ArrayList;
import java.util.List;

public class FindDuplicateList {

  public static void main(String[] args) {
    List<Integer> numberList = new ArrayList<Integer>();

    for (int i = 1; i <= 20; i++) {
      numberList.add(i);
    }

    for (int i = 2; i <= 10; i = i + 2) {
      numberList.add(i);
    }

    System.out.println(duplicateHelper(numberList));
  }

  private static boolean duplicateHelper(List<Integer> numberList) {
    if (numberList.size() == 1)
      return false;
    int currentElement = numberList.remove(0);
    if (numberList.contains(currentElement)) {
      return true;
    }
    return duplicateHelper(numberList);
  }

}
