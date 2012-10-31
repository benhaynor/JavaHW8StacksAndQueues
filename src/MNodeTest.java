import static org.junit.Assert.*;

import org.junit.Test;


public class MNodeTest {

	@Test
	public void test() {
		MNode<String> node = new MNode<String>("Hello");
		assertTrue(node.getData().equals("Hello"));
	}

}
