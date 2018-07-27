/*
 *  Node -> NextNode
 *  
 */
public class LinkedList<E> {

	class Node<E> {
		E item;
		Node<E> next;

		Node(E data) {
			item = data;
			next = null;
		}
	}

	Node<E> firstElement;
	Node<E> lastElement;

	int size = 0;

	public boolean add(E e) {
		addLast(e);
		return true;
	}

	public void addLast(E e) {
		Node<E> l = lastElement;
		Node<E> node = new Node<E>(e);
		lastElement = node;

		if (l == null) {
			firstElement = node;
		} else {
			l.next = node;
		}

		size++;
	}

	public int size() {
		return size;
	}

	public void addFirst(E e) {
		Node<E> f = firstElement;
		Node<E> node = new Node<E>(e);
		firstElement = node;
		if (f == null) {
			lastElement = node;
		} else {
			firstElement.next = f;
		}
		size++;
	}

	public boolean remove(E e) {

		Node<E> currentElement = firstElement;
		Node<E> prevElement = null;
		while (currentElement.next != null) {
			if (currentElement.item.equals(e)) {
				if (prevElement == null) {
					firstElement = currentElement.next;
				} else {
					prevElement.next = currentElement.next;
				}
				size--;
				return true;
			}
			prevElement = currentElement;
			currentElement = currentElement.next;
		}

		return false;

	}

	public int indexOf(E e) {
		int index = 0;
		Node<E> currentElement = firstElement;
		while (currentElement.next != null) {
			if (currentElement.item.equals(e)) {
				return index;
			}
			index++;
			currentElement = currentElement.next;

		}
		return -1;
	}

	public E get(int index) {

		if(index<0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node<E> currentElement = firstElement;
		for (int i = 0; i < index; i++) {
			currentElement = currentElement.next;
		}
		return currentElement.item;

	}
}
