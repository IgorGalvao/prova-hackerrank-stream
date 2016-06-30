package stream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AvaliadorDeStreamTest {
	
	@Test
	public void deveEncontrarCaractereNoInicioDaStream() {
		Stream input = new CharStream("bAaBABac");
		
		assertEquals('b', AvaliadorDeStream.firstChar(input));
	}
	
	@Test
	public void deveEncontrarCaractereNoMeiodaStream() {
		Stream input = new CharStream("bAabBAc");
		
		assertEquals('a', AvaliadorDeStream.firstChar(input));
	}
	
	@Test
	public void deveEncontrarCaractereNoFimDaStream() {
		Stream input = new CharStream("bAabAac");
		
		assertEquals('c', AvaliadorDeStream.firstChar(input));		
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void deveResponderComMensagemSeNaoEncontrarCaractere() {
		Stream input = new CharStream("bAabAa");
		
		AvaliadorDeStream.firstChar(input);
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void deveIgnorarCaractereQueApareceTresVezes() {
		Stream input = new CharStream("bAbAb");

		AvaliadorDeStream.firstChar(input);
	}
	
}
