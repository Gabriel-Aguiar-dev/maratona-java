package cursojava;

public class Aula06EstrurasDeRepeticao01 {

	public static void main(String[] args) {
		// while, do while, for
		int count = 0;
		while (count < 10) {
			System.out.println(++count);
		}
		
		do {
			System.out.println("dentro-do-while");
		} while (count < 10);
		
		
		for (int i=0; i < 10; i++) {
			System.out.println("for "+i);	
		}
	}

}
