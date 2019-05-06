import javax.xml.crypto.*;

import static java.lang.Math.E;

public class Node<E>
{
	//declare fields
	private Node<E> link;
	private E data;

	/**
	 * @param initialData
	 * @param initialLink
	 */
	public Node (E initialData, Node<E> initialLink)
	{
		data = initialData;
		link = initialLink;

	}
	/**
	* getData method gets data and returns data
	* returns data
	*/
	public E getData()
	{
		return data;
	}
	}
	/**
	* getLink method gets link
	* returns link
	*/
	public Node<E> getLink()
	{
		return link;
	}
	public void setData(E initialData)
	{
		data = initialData;
	}
	public void setLink(Node<E> initialLink)
	{
		link = initialLink;
	}


}
