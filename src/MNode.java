public class MNode<E>{

	private E data;
	private MNode<E> next;
	
	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public MNode(E data){
		this.data = data;
		next = null;
	}
	
	public void setNext(MNode<E> next){
		this.next = next;
	}
	
	public MNode<E> getNext(){
		return next;
	}
	
	public void print(){
		System.out.println(data);
		if (next != null){
			next.print();
		}
	}
}
