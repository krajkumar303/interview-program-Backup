import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SmallestSubArray {
  public static void main(String[] args) {
    Integer[] inputArray = {-100, -100, -100 ,-100, 16, -100};
    Integer total = 15;
    subArray(inputArray, total);
    int length = smallestSubArray(inputArray, total);
    if (length > inputArray.length) {
      System.out.println("Tootal is greater than sum of individual elements");
    } else {
      System.out.println(length);
    }
  }

  private static int smallestSubArray(Integer[] inputArray, Integer total) {
    Integer sum = 0;
    int length = inputArray.length + 1;
    for (int i = 0; i < inputArray.length; i++) {
      sum = inputArray[i];
      if (sum >= total) {
        length = 1;
      }
      for (int j = i + 1; j < inputArray.length && sum < total; j++) {
        sum = sum + inputArray[j];
        if (sum > total) {
          length = (j - i) + 1 < length ? (j - i) + 1 : length;
          j = inputArray.length;
        }
      }
    }

    return length;
  }

  private static void subArray(Integer[] inputArray, Integer total) {
    Integer sum = 0;
    List<Integer> subList = new ArrayList<Integer>();
    Map<List<Integer>, Integer> dataMap = new HashMap<List<Integer>, Integer>();

    for (int i = 0; i < inputArray.length; i++) {
      subList = new ArrayList<Integer>();
      sum = inputArray[i];
      subList.add(inputArray[i]);
      if (sum >= total) {
        dataMap.put(subList, subList.size());
      }
      for (int j = i + 1; j < inputArray.length && sum < total; j++) {
        sum = sum + inputArray[j];
        subList.add(inputArray[j]);
        if (sum > total) {
          dataMap.put(subList, subList.size());
          j = inputArray.length;
        }
      }
    }
    System.out.println(dataMap);
  }
}