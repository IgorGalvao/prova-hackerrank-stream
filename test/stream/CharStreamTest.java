package stream;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharStreamTest {

	@Test(expected=RuntimeException.class)
	public void deveRejeitarStreamNula() {
		new CharStream(null);
	}

	@Test
	public void deveEntenderStreamVazia() {
		Stream input = new CharStream("");
		
		assertFalse(input.hasNext());
	}
	
	@Test
	public void deveEntenderStreamComTresCaracteres() {
		Stream input = new CharStream("Aab");
		
		assertTrue(input.hasNext());
		assertEquals('A', input.getNext());

		assertTrue(input.hasNext());
		assertEquals('a', input.getNext());

		assertTrue(input.hasNext());
		assertEquals('b', input.getNext());

		assertFalse(input.hasNext());
	}

}
