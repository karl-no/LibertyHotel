package exercicio;

import java.util.ArrayList;
import java.util.Collection;

public class LogSingleton {
	private static LogSingleton instance;
	private Collection<String> textos;
	
	private LogSingleton () {
		
	}
	
	public static LogSingleton getInstance() {
		
		if(instance == null) {
			instance = new LogSingleton();
		}
		
		return instance;
	}
	
	public Collection<String> getTextos() {
		return textos;
	}

	public void setTextos(Collection<String> textos) {
		this.textos = textos;
	}
	
	public static void main(String[] args) {
		
		LogSingleton log = new LogSingleton();
		log.setTextos(new ArrayList<String>());
		
		log.getTextos().add("Log1");
		log.getTextos().add("Log2");
		log.getTextos().add("Log3");

		LogSingleton log2 = new LogSingleton();
		log2.setTextos(new ArrayList<String>());
		
		log2.getTextos().add("Log4");
		log2.getTextos().add("Log5");
		log2.getTextos().add("Log6");
		
		System.out.println(log2.getTextos());
		
	}

}
