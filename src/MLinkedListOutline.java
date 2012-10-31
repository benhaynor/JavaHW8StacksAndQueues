public interface MLinkedListOutline<E>{

	//Add methods
	/*
	 * Inserts the specified element at the beginning of this list.
	 */
	public void addFirst(E e);
	/*
	 * Appends the specified element to the end of this list.
	 */

	public void addLast(E e);
	/*
	 * Inserts the specified element at the specified position in this list.
	 * Shifts the element currently at that position (if any) 
	 * and any subsequent elements to the right (adds one to their indices).
	 */
	public void add(int index, E element);

	//GET Methods
	/*
	 * Returns the element at the specified position in this list.
	 */
	public E get(int index);
	
	/*
	 * Returns the first element in this lis
	 */
	public E getFirst();
	
	/*
	 * Returns the last element in this list.
	 */
	public E getLast();

	//Remove Methods
	/*
	 * Removes and returns the last element from this list.
	 */
	public E remove(int index);
	
	/*
	 * Removes and returns the last element from this list.
	 */
	public E removeLast();
	
	/*
	 * Removes and returns the first element from this list.
	 */
	public E removeFirst();
}
