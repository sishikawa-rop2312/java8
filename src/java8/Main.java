package java8;

public class Main {
	public static void main(String[] args) {
		// 1. 勇者を生成
		Hero h = new Hero();
		
		// 2. フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.printf("勇者%sを生み出しました！\n", h.name);
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		// 3. 冒険のはじまり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
