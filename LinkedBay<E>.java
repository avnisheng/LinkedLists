/**
 *
 * 
 */
public class LinkedBag<E>
{
	//declare variables
	private Node<E> head;
	private int numElements;

	/**
	*
	*/
	public LinkedBag()
	{
		head = null;
		numElements = 0;
	}
	public int getSize()
	{
		return numElements;
	}
	public void add(E element)
	{
		head = new Node<E>(element, head);
		numElements++;

	}
	public int countOccurrences(E target)
	{
		Node<E> cursor = head;
		int numOccurences = 0;
		for(cursor = head; cursor != null; cursor = cursor.getLink())
		{
			if (cursor.getData() == target)
			{
				numOccurences++;
			}
		}
		return numOccurences;
	}
	public boolean exists(E target)
	{
		boolean found = false;
		Node<E> cursor = head;

		while(cursor != null && !found)
		{
			if (cursor.getData() == target)
			{
				found = true;
			}
			else
			{
				cursor = cursor.getLink();
			}
		}
		return found;
	}
	public boolean remove(String target) {
		Node<E> cursor = head;
		boolean found = false;

		while (cursor!= null && !found)
		{
			if (cursor.getData().equals(target))
				found = true;
			else
				cursor = cursor.getLink();
		}

		if (found) {

			cursor.setData(head.getData());
			head = head.getLink();
			numElements--;
		}
		return found;
	}
	public String toString() {
		String stringToReturn = "";
		Node<E> cursor;

		if (numElements == 0) {
			stringToReturn = "empty";
		} else {
			for (cursor = head; cursor != null; cursor = cursor.getLink()) {
				stringToReturn = stringToReturn + cursor.getData();
				if (cursor.getLink() != null) {
					stringToReturn = stringToReturn + ", ";
				}
			}
		}
		return stringToReturn;
	}

}
