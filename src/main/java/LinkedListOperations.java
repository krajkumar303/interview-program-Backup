
public class LinkedListOperations {

	public static void main(String[] args) {
		int[] input = { 10, 12, 15, 20, 25 };
		insert(input);
	}

	private static void insert(int[] input) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i < input.length; i++) {
			linkedList.add(input[i]);
		}
		linkedList.addFirst(5);
		linkedList.addLast(35);
		System.out.println(linkedList.size());
		System.out.println(linkedList.firstElement.item);
		System.out.println(linkedList.lastElement.item);
		linkedList.remove(12);
		System.out.println("Index of 15::"+linkedList.indexOf(15));
		System.out.println("Element ad Index 3::"+linkedList.get(13));
	}

}
