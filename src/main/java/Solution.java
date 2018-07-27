import java.util.ArrayList;
import java.util.List;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{ 
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<String> reorderLines(int logFileSize, List<String> logLines) 
	{
		// WRITE YOUR CODE HERE
		
    for (int i = 0; i < logFileSize;) {
      boolean procced = true;
      String currentLine = logLines.get(i);
      String[] currentLineWord = currentLine.split(" ");
      for (int j = i + 1; procced && j <= logFileSize - 1; j++) {
        String nextLine = logLines.get(j);
        String[] nextLineWord = nextLine.split(" ");
        int compare = 0;
        Integer index = 1;
        compare = checkOrder(currentLineWord, nextLineWord, index);

        if (compare > 0) {
          logLines.remove(j);
          logLines.add(i, nextLine);
          procced = false;
        }
      }
      if (procced)
        i++;
    }
    return logLines;
  
	}
	
	private int checkOrder(String[] currentLineWord, String[] nextLineWord, Integer index) {
    String regex = ".*\\d+.*";
    if (currentLineWord[index].matches(regex) && nextLineWord[index].matches(regex)) {
      return 0;
    }
    if (currentLineWord[index].matches(regex) && !nextLineWord[index].matches(regex)) {
      return 1;
    } else if (!currentLineWord[index].matches(regex) && nextLineWord[index].matches(regex)) {
      return -1;
    } 
    return currentLineWord[index].compareTo(nextLineWord[index]);

  }
	// METHOD SIGNATURE ENDS
}