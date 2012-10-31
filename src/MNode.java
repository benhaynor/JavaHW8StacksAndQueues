public class MNode<E>{

	private E data;
	private MNode<E> next;
	
	public MNode(E data){
		this.data = data;
		next = null;
	}

	public MNode(E data, MNode<E> next){
		this.data = data;
		this.next = next;
	}
	
	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	
	public void setNext(MNode<E> next){
		this.next = next;
	}
	
	public MNode<E> getNext(){
		return next;
	}

	public String toString(){
		return data.toString();
	}
}
