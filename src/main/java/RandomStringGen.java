
public class RandomStringGen {

  public static void main(String[] args) {
	  RandomStringGen rg = new RandomStringGen();
	  String randomString=rg.generateRandomString();
	  System.out.println(randomString);
  }

  public String generateRandomString() {

    String alphabets = "AaBbCc123";
    int length = 8;
    int i = 1;
    StringBuilder sb = new StringBuilder("");
    while (i <= length) {
      sb.append(alphabets.charAt((int) Math.random()));
      i++;
    }
    
    return sb.toString();
  }
}
