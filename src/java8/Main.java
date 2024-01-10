package java8;

public class Main {
	public static void main(String[] args) {
		// 1. 勇者を生成
		Hero h = new Hero();
		
		// 2. フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.printf("勇者%sを生み出しました！\n", h.name);
		
		// 3. 勇者のメソッドを呼び出していく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}
