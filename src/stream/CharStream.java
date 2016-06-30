package stream;

public class CharStream implements Stream {

	private String input;
	private int index = -1;

	public CharStream(String input) {
		if(input != null) {
			this.input = input;			
		} else {
			throw new RuntimeException("Input não pode ser nulo.");
		}
	}

	@Override
	public boolean hasNext() {
		try {
			input.charAt(index+1);
			return true;
		} catch(IndexOutOfBoundsException e) {
			return false;
		}
	}

	@Override
	public char getNext() {
		index++;
		return input.charAt(index);
	}

}
