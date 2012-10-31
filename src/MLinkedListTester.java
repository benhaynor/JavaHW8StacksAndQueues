import static org.junit.Assert.*;

import org.junit.Test;


public class MLinkedListTester {

	public MLinkedList<String> getHW(){
		MLinkedList<String> strings = new MLinkedList<String>("hello");
		assertTrue(strings.get(0).equals("hello"));
		strings.addLast("world");
		strings.addLast("!");
		return strings;
	}
	
	@Test
	public void testAdd() {
		MLinkedList<String> strings = getHW();
		assertTrue(strings.get(0).equals("hello"));
		assertTrue(strings.get(1).equals("world"));
		assertTrue(strings.get(2).equals("!"));
	}
	
	@Test
	public void testPrint(){
		MLinkedList<String> strings = getHW();
		assertTrue(strings.toString().equals("[hello,world,!]"));
		MLinkedList<String> empty = new MLinkedList<String>();
		assertTrue(empty.toString().equals("[]"));
	}
}