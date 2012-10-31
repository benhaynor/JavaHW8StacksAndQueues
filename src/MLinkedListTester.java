import static org.junit.Assert.*;

import org.junit.Test;


public class MLinkedListTester {

	@Test
	public void testAdd() {
		MLinkedList<String> strings = new MLinkedList<String>("hello");
		assertTrue(strings.get(0).equals("hello"));
		strings.addLast("world");
		strings.addLast("!");
		assertTrue(strings.get(0).equals("hello"));
		assertTrue(strings.get(1).equals("world"));
		assertTrue(strings.get(2).equals("!"));
	}
}