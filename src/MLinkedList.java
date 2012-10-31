
public class MLinkedList<E>{

	private MNode<E> first;
	private int size;
	
	public MLinkedList(E e){
		first = new MNode<E>(e);
		size = 1;
	}

	public MLinkedList(){
		first = null;
		size = 0;
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
		getNode(size -1).setNext(new MNode<E>(e));
		size ++;
	}
	
	public void add(int index, E e){
		//Note: this currently does not work for adding at index 0.
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		if (index == 0){
			System.out.println("Adding at zero not yet handled");
			System.exit(1);
		} else if (index == (size)){
			System.out.println("Adding to end of list not yet handled");
			System.exit(1);
		} else{
			MNode<E> pre = getNode(index-1);
			MNode<E> post = getNode(index);
			MNode<E> toInsert = new MNode<E>(e);
			pre.setNext(toInsert);
			toInsert.setNext(post);
			size ++;
		}
	}
	
	public String toString(){
		StringBuilder stringRep = new StringBuilder("[");
		MNode<E> cur = first;
		for (int i = 0; i < size; i ++){
			stringRep.append(cur.toString());
			stringRep.append(",");
			cur = cur.getNext();
		}
		if (stringRep.length() > 1)
			stringRep.setCharAt(stringRep.length() -1,']');
		else
			stringRep.append("]");
		return stringRep.toString();
	}
	
	public E get(int index){
		return getNode(index).getData();
	}
}