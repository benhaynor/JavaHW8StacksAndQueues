
public class MLinkedList<E>{

	/*
	 * TODO: Implement the add methods 
	 * void add(E e, index i); 
	 * void addFirst(E e); //
	 * void addLast(E e);
	 * TODO: Implement the get methods
	 * E get(index i);
	 * E getFirst;
	 * E getLast;
	 * TODO: Implement the remove methods
	 * E remove(index i);
	 * E removeFirst();
	 * E removeLast(); 
	 * TODO: Implement the following constructors
	 * MLinkedList(); //Creates an empty linked list.
	 * MLinkedList(E e) //Creates a linked list with one elment.
	 * Optional: 
	 * Implement the following helper methods.  Note: depending on how you
	 * choose to implement add, and remove, these may not be necessary:
	 * private void addOnly(E); Adds the only element
	 * private void removeOnly(E);  Removes the last node
	 * private Node<E> getNode(index i); //Returns the node at index i;
	 */
	
	private MNode<E> first;
	private int size;
	
	public MLinkedList(E e){
		first = new MNode<E>(e);
		size = 1;
	}
	
	private MNode<E> getNode(int index){
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		MNode<E> cur = first;
		for (int i = 0; i < index; i ++){
			cur = cur.getNext();
		}
		return cur;
	}
	
	public void addLast(E e){
		MNode<E> last = getNode(size -1);
		last.setNext(new MNode<E>(e));
		size ++;
	}
	
	public void add(int index, E e){
		//Note: this currently does not work for adding at index 0.
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		MNode<E> pre = getNode(index-1);
		MNode<E> post = getNode(index);
		MNode<E> toInsert = new MNode(e);
			pre.setNext(toInsert);
		toInsert.setNext(post);
		size ++;
	}
	
	public void print(){
		MNode<E> cur = first;
		for (int i = 0; i < size; i ++){
			System.out.println(cur.getData());
			cur = cur.getNext();
		}
	}
	
	public static void main(String[] args){
		MLinkedList<String> eits 
			= new MLinkedList<String>("Susannah");
		eits.addLast("Osborn");
		eits.addLast("Linda");
		eits.addLast("Adelaide");
		eits.add(2,"SamG");
		eits.print();
		
	}
}
