package java8;

public class ClericMain {
	public static void main(String[] args) {
		Cleric cl = new Cleric();
		
		cl.selfAid();
		int pray =cl.pray(10);
		
		System.out.println(pray);
	}
}
