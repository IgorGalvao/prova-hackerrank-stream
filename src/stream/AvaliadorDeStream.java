package stream;

import java.util.ArrayList;
import java.util.List;

public class AvaliadorDeStream {
	
	public static char firstChar(Stream input) {
		List<Character> list = new ArrayList<Character>();
		List<Character> repetidos = new ArrayList<Character>();

		while(input.hasNext()) {
			Character nextChar = input.getNext();
			
			if(list.contains(nextChar)) {
				list.remove(nextChar);			// remove da lista de candidatos a firstChar o caractere repetido
				repetidos.add(nextChar);		// e o adiciona na lista de repetições detectadas
			} else {
				if(!repetidos.contains(nextChar))	// caso não tenha sido detectado como repetido anteriormente,
					list.add(nextChar);				// adiciona na lista de candidatos a firstChar
			}
		}

		if(list.size() > 0) {
			return list.get(0);			// retorna o char não repetido que apareceu primeiro no stream
		} else {
			throw new IndexOutOfBoundsException("Não foi encontrado caractere sem repetição no stream.");
		}
	}
}
